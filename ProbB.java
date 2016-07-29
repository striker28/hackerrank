package algos;

import java.util.Scanner;

class ProbB {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();
		
		int[] a1 = new int[n];
		int[] a2 = new int[n];
		long[] b1 = new long[n];

		
		for(int i=0;i<n;i++){
			a1[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++){
			a2[i]=sc.nextInt();
		}
	
		for(int i=0;i<n;i++){
			b1[i]=a1[i]*a2[i];
		}
		
		long sum=0;
		
		long change = k*2;
		
		for(int i=0;i<n;i++){
			sum+=b1[i];
		}
		
		long minSum=sum;
		
		for(int i=0;i<n;i++){
			long sumTest= sum - b1[i];
		
			// +ve change
			long a1Pos = a1[i]+change;
			long testP = sumTest+ a1Pos*a2[i];
	
			// -ve change
			long a1Neg = a1[i]-change;
			long testN = sumTest+ a1Neg*a2[i];
			
			long test=testP;
			if(testN<test){
				test=testN;
			}
			
			if(minSum>test){
				minSum=test;
			
			}
			
		}
		
		
		System.out.println(minSum);
		sc.close();
	}
}
