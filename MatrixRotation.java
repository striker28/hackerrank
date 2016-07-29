package algos;

import java.util.Scanner;

public class MatrixRotation {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numRows = sc.nextInt();
		int numCols = sc.nextInt();
		int numRotations = sc.nextInt();
		int numOfSets = Math.min(numCols, numRows)/2;
		int[][] a = new int[numRows][numCols];
		int[][] b = new int[numRows][numCols];
		for(int i=0;i<numRows;i++){
			for(int j=0;j<numCols;j++){
				a[i][j]=sc.nextInt();
			}
		}
		
		/*for(int i=0;i<numRows;i++){
			for(int j=0;j<numCols;j++){
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}*/
		
		int sets=0;
		int rots=0;
		int row=numRows;
		int col=numCols;
		while( sets < numOfSets ){
			
			int r1 = sets;
			int c1 = sets;
			
			for(int i=0;i < 2 * (row + col);i++){
				if(r1==sets && c1!=sets){
					while( c1 >= 0 ){
						c1--;
					}
				}
				else if(r1==row-1-sets && c1!=col-1-sets){
					while( c1 < col-1-sets ){
						c1++;
					}
				}
				else if(c1==sets && r1!=row-1-sets){
					while( r1 < col-1-sets ){
						r1++;
					}
				}
				else if(c1==col-1-sets && r1!=sets){
					while( r1 >= 0 ){
						r1--;
					}
				}
			}
			
			sets++;
		}
		
		

		while( rots < numRotations ){
			while(r1<)
		}
		
		
		
		
		
	}
}
