package algos;

import java.util.Scanner;

public class IcecreamParlor {
	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		int T = sc.nextInt();
		int[][] ans = new int[T][2];
		
				
		for(int t=0;t<T;t++){
			
			int M = sc.nextInt();
			int N = sc.nextInt();
			int[] arr = new int[N];
			int flag=0;
			int a1=0;
			int a2=0;
			
			for(int i=0;i<N;i++){
				arr[i]=sc.nextInt();
			}
			
			for(int i=0;i<N-1;i++){
				int a=arr[i];
				for(int j=i+1;j<N;j++){
					if(arr[j]==M-a){
						flag=-1;
						a2=j;
						break;
					}
				}
				if(flag==-1){
					a1=i;
					break;
				}
			}
			
			if(flag==-1){
				ans[t][0]=a1+1;
				ans[t][1]=a2+1;
			}
			
		}
		
		
		sc.close();
		
		for(int p=0;p<T;p++){
			System.out.println(ans[p][0]+" "+ans[p][1]);
		}
	}
}
