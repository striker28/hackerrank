package algos;

import java.util.Scanner;

public class EqualStacks {
	   public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n1 = in.nextInt();
	        int n2 = in.nextInt();
	        int n3 = in.nextInt();
	        int h1[] = new int[n1];
	        for(int h1_i=n1-1; h1_i >= 0; h1_i--){
	            h1[h1_i] = in.nextInt();
	        }
	        int h2[] = new int[n2];
	        for(int h2_i=n2-1; h2_i >=0; h2_i--){
	            h2[h2_i] = in.nextInt();
	        }
	        int h3[] = new int[n3];
	        for(int h3_i=n3-1; h3_i >=0; h3_i--){
	            h3[h3_i] = in.nextInt();
	        }
	        
	        for(int i=1;i<n1;i++){
	        	h1[i]+=h1[i-1];
	        }
	        

	        for(int i=1;i<n2;i++){
	        	h2[i]+=h2[i-1];
	        }
	        

	        for(int i=1;i<n3;i++){
	        	h3[i]+=h3[i-1];;
	        }
	     /*   System.out.println();
	        for(int i=0;i<n1;i++){
	        	System.out.print(h1[i]+" ");
	        }
	        System.out.println();

	        for(int i=0;i<n2;i++){
	        	System.out.print(h2[i]+" ");
	        }
	        System.out.println();

	        for(int i=0;i<n3;i++){
	        	System.out.print(h3[i]+" ");
	        }
	        System.out.println();*/
	        int x = h1.length-1;
	        int y = h2.length-1;
	        int z = h3.length-1;
	        
	        int ht=0;
	        while(x!=0 && y!=0 && z!=0){
	        	if(h1[x]>h2[y] && x>0){
	        		x--;
	        	}
	        	else if(h1[x]<h2[y]  && y>0){
	        		y--;
	        	}
	        	else if(h2[y]>h3[z]  && y>0){
	        		y--;
	        	}
	        	else if(h2[y]<h3[z]  && z>0 ){
	        		z--;
	        	}
	        	else if(h1[x]<h3[z] && z>0){
	        		z--;
	        	}
	        	else if(h1[x]>h3[z] && x>0){
	        		x--;
	        	}
	        	
	        	if(h1[x]==h2[y]){
	        		if(h2[y]==h3[z]){
	        			ht=h1[x];
	        			break;
	        		}
	        	}
	        }
	        if(h1[x]==h2[y]){
        		if(h2[y]==h3[z]){
        			ht=h2[y];
        			
        		}
        	}
	        System.out.println(ht);
	        in.close();
	    }
}
