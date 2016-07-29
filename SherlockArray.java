package algos;

import java.util.Scanner;

public class SherlockArray {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int T = sc.nextInt();
		
		boolean[] ans = new boolean[T];
		for(int t=0;t<T;t++){
			int N = sc.nextInt();
			int[] arr = new int[N];
			
			for(int i=0;i<N;i++){
				arr[i]=sc.nextInt();
			}
			
			
			
			int x=0;
			int y=N-1;
			
			long sl=arr[x];
			long sr=arr[y];
			
			while((y-x)>2){				
				
				if(sl<sr){
					x++;
					sl+=arr[x];
				}
				
				else{
					y--;
					sr+=arr[y];
				}
				//System.out.println("sl: "+sl +" && " + "sr: "+sr + " x: "+ x +" y: "+y);
			}
			
			if(sl==sr){
				ans[t]=true;
				//System.out.println("YES");
			}
			else{
				ans[t]=false;//System.out.println("NO");}
			}
		}
		sc.close();
		
		for(boolean p:ans){
			if(p){System.out.println("YES");}
			else{System.out.println("NO");}
		}
	}
}
