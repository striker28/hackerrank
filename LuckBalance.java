package algos;

import java.util.Arrays;
import java.util.Scanner;

public class LuckBalance {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int tPoints=0;
		Contest[] contest = new Contest[N];
		for(int i=0;i<N;i++){
			contest[i]= new Contest();
			contest[i].points=sc.nextInt();
			contest[i].priority=sc.nextInt();
			
		}
		int countZeroPriority=0;
		for(int i=0;i<N;i++){
			if(contest[i].priority==0){tPoints+=contest[i].points;
			countZeroPriority++;
			}
			
		}
		
		int countNonZeroPriority = N-countZeroPriority;
		int[] impMatches = new int[countNonZeroPriority];
		
		int j=0;
		for(int i=0;i<N;i++){
			if(contest[i].priority==1){
				impMatches[j]=contest[i].points;
				j++;
			}
			
		}
		 int i=0;
		Arrays.sort(impMatches);
		for(i=countNonZeroPriority-1;i>=(countNonZeroPriority-K);i--){
			tPoints+=impMatches[i];
		//	System.out.println(impMatches[i]);
		}
	//	System.out.println("----------------");
		for(;i>=0;i--){
			tPoints-=impMatches[i];
		//	System.out.println(impMatches[i]);
		}
		sc.close();
		System.out.println(tPoints);
	}
}

class Contest{
	int points;
	int priority;
}