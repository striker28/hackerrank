package algos;

import java.util.Scanner;

public class Alt_char {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int T = sc.nextInt();
		int[] arr = new int[T];
		for(int t=0;t<T;t++){
			String s = sc.next();
			
			int i=0;
			int count=0;
			while(i<s.length()-1){
				int a=i;
				int b=i+1;
				while(b<s.length() && s.charAt(a)==s.charAt(b)){
					b++;
					count++;
				}
				i=b;
			}
			arr[t]=count;
		}
	//	System.out.println("----------");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		sc.close();
	}
	
	
}
