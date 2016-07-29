package algos;

import java.util.Scanner;

public class SavePrisoners {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		long arr[] = new long[T];
		for(int t=0;t<T;t++){
			
			long n =sc.nextInt();
			long m =sc.nextInt();
			long s =sc.nextInt();
				
			arr[t]=(m%n + s-1)%n;
			
			
		}
		for(int i=0;i<T;i++){
			System.out.println(arr[i]);
		}
		sc.close();
	}
}
