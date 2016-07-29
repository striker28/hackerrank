package algos;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;
import java.util.Arrays;
 
public class WaysOfMakingChange 
{
    static int den;
    static int nextDen;
    static int[] weights;
    class AmountDenom
    {
        int amount;
        int den;
         
        public AmountDenom(int amount, int denom)
        {
            this.amount = amount;
            this.den = denom;
        }
         
        // we need to override hashCode and equals method for user defined objects when these objects are used as keys
        @Override
        public int hashCode()
        {
            // since this code uses jdk 7
            return Objects.hash(this.amount, this.den);
        }
         
        @Override
        public boolean equals(Object obj){
            if (obj instanceof AmountDenom) {
                AmountDenom keyObj = (AmountDenom) obj;
                return (keyObj.amount == this.amount && keyObj.den == this.den);
            } else {
                return false;
            }
        }
    }
     
     
   
    public int countNumberOfWays(int amount, int den, HashMap<AmountDenom, Integer> numberOfWays)
    {
        // if only denominations available is 1 then number of ways to make change = 1
        
        if (den == weights.length-1){
            if(amount%weights[den]==0){
            	numberOfWays.put(new AmountDenom(amount, weights[den]),1);
            	return 1;
            }
            else 
            	numberOfWays.put(new AmountDenom(amount, weights[den]),0);
            	return 0;
        }
         else{
            nextDen=den+1;
        }
         
     
         
      
         
        // try all possible number of coins of current denomination
        int numberOfCoins = 0, ways = 0, modifiedAmount;
        while ((numberOfCoins*weights[den]) <= amount)
        {
            modifiedAmount = amount - (numberOfCoins*weights[den]);
             
            // check if we have already computed the number of ways for this amount and denom set
            if (numberOfWays.get(new AmountDenom(modifiedAmount, weights[den])) != null)
            {
                ways += numberOfWays.get(new AmountDenom(modifiedAmount, weights[den]));
            }
            else
            {
                ways += countNumberOfWays(modifiedAmount, nextDen, numberOfWays);
            }
            numberOfCoins += 1;
        }
         
        // store the computed result for re-use
        numberOfWays.put(new AmountDenom(amount, weights[den]), ways);
        return ways;
    }
 
     
    // denominations we can use : 20,10,5 and 1
    public int countNumberOfWays(int amount, int den)
    {
        // if only denominations available is 1 then number of ways to make change = 1
        if (den == weights.length-1){
            if(amount%weights[den]==0){return 1;}
            else return 0;
        }
          
        else{
            nextDen=den+1;
        }
        
      
         
        // try all possible number of coins of current denomination
        int numberOfCoins = 0, ways = 0;
        while ((numberOfCoins*weights[den]) <= amount)
        {
            ways += countNumberOfWays(amount - (numberOfCoins*weights[den]), nextDen);
            numberOfCoins += 1;
        }
         
        return ways;
    }
     
     
    public static void main(String[] args) 
    {
        WaysOfMakingChange solution = new WaysOfMakingChange();
         
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        weights = new int[N];
        
        for(int y=0;y<N;y++){
            weights[y]=-sc.nextInt();
        }
        Arrays.sort(weights);
         for(int y=0;y<N;y++){
            weights[y]=-weights[y];
        }
        int ans=0;
        int L = sc.nextInt();
        int R = sc.nextInt();
        
        for(int y=L;y<=R;y++){
            HashMap<AmountDenom, Integer> numberOfWays = new HashMap();
            int add=solution.countNumberOfWays(y, 0, numberOfWays);
            ans+=add;
            System.out.println(add);
    }
        System.out.println("------------"+ans);
}
}