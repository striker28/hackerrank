package algos;

import java.util.Scanner;

public class FunnyString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T =sc.nextInt();
		boolean[] ans = new boolean[T];
		for(int t=0;t<T;t++){
			String s = sc.next();
			int i=0;
			int j=s.length()-1;
			int flag=0;
			while(i<s.length()-	1){
				if( Math.abs( s.charAt(i)- s.charAt(i+1) ) != Math.abs( s.charAt(j) - s.charAt(j-1)  ) ){
					flag=-1;
					break;
				}
								
				i++;
				j--;
			}
			if(flag==-1)
				ans[t]=false;
			else
				ans[t]=true;
		}
		sc.close();
		for(boolean p:ans){
			if(p){System.out.println("Funny");}
			else{System.out.println("Not Funny");}
		}
	}
}
