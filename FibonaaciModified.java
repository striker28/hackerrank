package algos;

import java.math.BigInteger;
import java.util.Scanner;


public class FibonaaciModified {
	
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		BigInteger b1 = BigInteger.valueOf(a);
		BigInteger b2 = BigInteger.valueOf(b);
		BigInteger b3 = BigInteger.valueOf(0);
		
		//System.out.println(b1+" "+b2+ " "+b3);
		for(int i=0;i<n-2;i++){
			b3 = b2.multiply(b2);
			b3=b3.add(b1);
			
			b1=b2;
			b2=b3;
			
		/*	System.out.println("b3: "+b3+
					"b2: "+b2+
					"b1: "+b1); */
		}
		System.out.println(b3);
	}
	
	
}
