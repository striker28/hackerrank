package algos;

import java.util.Scanner;

public class Kangaroos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x1 = sc.nextInt();
		int v1 = sc.nextInt();
		
		int x2 = sc.nextInt();
		int v2 = sc.nextInt();
		
		if(x1>x2){
			if(v1>=v2){
				System.out.println("NO");
			}
			
			else{
				float t= (x2-x1)/(v1-v2);
				if(t>=0 && t%1==0){
					System.out.println("YES");
				}
			}
		}
		
		else if(x1==x2){System.out.println("YES");}
		else{
			if(v2>=v1){
				System.out.println("NO");
			}
			else{
				float t= (x2-x1)/(v1-v2);
				if(t>=0 && t%1==0){
					System.out.println("YES");
				}
			}
		}
		
		sc.close();
	}
}
