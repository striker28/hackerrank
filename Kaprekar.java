package algos;


import java.util.Scanner;

public class Kaprekar {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        int q = in.nextInt();
        
        int[] arr ={1, 9, 45 ,55 ,99, 297 ,703 ,999 ,2223, 2728 ,4950, 5050 ,7272, 7777, 9999,
        		17344, 22222 ,77778, 82656 ,95121, 99999};
        int i=0;
        int flag=0;
        while(i<arr.length){
        	if(arr[i]>=p && arr[i]<=q){
        		System.out.print(arr[i]+" ");
        		flag=-1;
        	}
        	
        	i++;
        }
        if(flag==0){
        	System.out.println("INVALID RANGE");
        }
    }
}
