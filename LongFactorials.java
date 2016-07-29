package algos;

import java.math.BigInteger;
import java.util.Scanner;

public class LongFactorials {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        BigInteger b1 = BigInteger.valueOf(1);
        BigInteger b2 = BigInteger.valueOf(1);
        for(int i=1;i<=n;i++){
        	b2=BigInteger.valueOf(i);
        	b1=b1.multiply(b2);
        	
        }
        
        System.out.println(b1);
    }
}
