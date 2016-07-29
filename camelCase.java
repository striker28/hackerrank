package algos;

import java.util.Scanner;

public class camelCase {
	public static void main(String[] args) {
		   Scanner in = new Scanner(System.in);
	        String s = in.next();
	        int count=1;
	        for(int i=0; i<s.length();i++){
	        	if(s.charAt(i)<='Z'){
	        		count++;
	        	}
	        }
	        System.out.println(count);
	}
}
