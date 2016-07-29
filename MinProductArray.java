package algos;

import java.util.Scanner;

public class MinProductArray {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();
		
		int[] a1 = new int[n];
		int[] a2 = new int[n];
		long[] b1 = new long[n];
	//	long[] b2 = new long[n];
		
		for(int i=0;i<n;i++){
			a1[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++){
			a2[i]=sc.nextInt();
		}
		
		/*
		 * Positive additions
		 */
		for(int i=0;i<n;i++){
			b1[i]=a1[i]*a2[i];
		}
		
		long sum=0;
		
		//long sumTest=0;
		long change = k*2;
		for(int i=0;i<n;i++){
			sum+=b1[i];
		}
		long minSum=sum;
		System.out.println(sum);
		for(int i=0;i<n;i++){
			long sumTest= sum - (b1[i]);
			System.out.print("Sum without this element: "+ sumTest + " ");
			// +ve change
			long a1Pos = a1[i]+change;
			long testP = sumTest+ a1Pos*a2[i];
			System.out.print("Sum by adding change: "+ testP+ " ");
			// -ve change
			long a1Neg = a1[i]-change;
			long testN = sumTest+ a1Neg*a2[i];
			System.out.print("Sum by subtacting change: "+ testN+ " ");
			long test=testP;
			if(testN<test){
				test=testN;
			}
			
			if(minSum>test){
				minSum=test;
				System.out.println("MinSum new: "+ minSum);
			}
			System.out.println();
			//System.out.println(sum+ "-------");
		}
		
		/*
		long change = k*2;
		long minValue = Long.MAX_VALUE;
		int pivot = -1;
		for(int i=0;i<n;i++){
			
			long test1 = a1[i]+change;
			test1 = a2[i]*test1;
			long test2 = a1[i]-change;
			test2 = a2[i]*test2;
			
			long test=test1;
			if(test2<test1){
				test=test2;
			}
			if(test < minValue){
				minValue=test;
				pivot = i;
			//	System.out.println("Change made: " + minValue + "index: " + pivot);
			}
		}
		
		for(int i=0;i<n;i++){
			if(i==pivot)
				b1[i]=minValue;
			else
				b1[i]=a1[i]*a2[i];
		}
		long sum=0;
		
		for(int i=0;i<n;i++){
			System.out.print(b1[i] +" ");
		}
		for(int i=0;i<n;i++){
			sum+=b1[i];
		}*/
		System.out.println(minSum);
		sc.close();
	}
}
