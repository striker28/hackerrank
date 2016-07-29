package algos;

import java.util.Scanner;

public class MaxXOR {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int max=0;
		for(int i=a;i<b;i++){
			for(int j=i+1;j<=b;j++){
				int test=i^j;
				if(test>=max){
					max=test;
				}
			}
		}
		System.out.println(max);
	}
}
