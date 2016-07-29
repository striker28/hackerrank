package algos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LazySorting {
	
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] arr = new int[N];
		
		for(int i=0;i<N;i++){
			arr[i]=in.nextInt();
		}
		
		
		int count=0;
		int flag=0;
		count=1;flag=1;
		
		ArrayList<Integer> al  = new ArrayList<>();
		Arrays.sort(arr);
		
		int index=0;
		
		for(int i=1;i<N;i++){
			if(arr[i]==arr[i-1]){
				count++;
				flag=0;
				continue;
			}
			else if(flag==0){
				al.add(index,count);
				index++;
				count=1;
				flag=1;
			}
			/*else if(arr[i]!=arr[i-1]){
				flag=1;
			}*/
		}
		if(count!=0){al.add(index,count);count=0;}
		System.out.println("Repeated elements");
		for(int y=0;y<al.size();y++){
			System.out.println(al.get(y));
		}
		//System.out.println(count);
		/*
		long factCount=1;
		
		for(int i=1;i<=count;i++){
			factCount=factCount*i;
		}
		
		double ans=0;
		for(long j=1;j<999999999;j++){
			ans=ans+j*(Math.pow(factCount, -j));
		}
		System.out.printf(String.format( "%.6f", ans ));*/
		
		double ans=factorial(N);
		System.out.println(ans);
		for(int i=0;i<al.size();i++){
			ans=ans/factorial(al.get(i));
			System.out.println(factorial(al.get(i)));
		}
		in.close();
		if(ans==1){
			ans=0;
			System.out.printf(String.format( "%.6f", ans ));
		}
		System.out.printf(String.format( "%.6f", ans ));
	}
	
	static double factorial(int n){
		double fact=1;
		for(int x=1;x<=n;x++){
			fact=fact*x;
		}
		return fact;
	}
	
	
}
