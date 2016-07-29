package algos;

import java.util.Scanner;

public class Encryption {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		double sqrtL = Math.sqrt(s.length());
		int len = s.length();
		
		int r =(int) sqrtL;
		int c=r;
		
		int R=r;
		int C=c;
		int flag=0;
		
		if( sqrtL%1 == 0){
			R=C=r;
			flag=-1;
		}
	//	System.out.println("1--------");
		
		while( r*c < len && flag==0 ){
			c++;
			if(r*c < len){
				r++;
			}
			R=r;
			C=c;
		}
		//System.out.println("2--------");
		Character[][] str = new Character[R][C];
		int ch=0;
		
		for(int i=0;i<R;i++){
			for(int j=0;j<C;j++){
				
					str[i][j]=null;
					
				
			}
		}
			for(int i=0;i<R;i++){
				for(int j=0;j<C;j++){
					if(ch<s.length()){
						str[i][j]=s.charAt(ch);
						ch++;
					}
				}
			}
		
		//System.out.println("3--------");
		for(int i=0;i<C;i++){
			for(int j=0;j<R;j++){
				if(str[j][i]!=null)
				System.out.print(str[j][i]);
			}
			System.out.print(" ");
		}
		
		sc.close();
	}
}
