package hackerrank;

import java.util.Scanner;

public class DiagonalDifference {	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int primary = 0;
        int secondary =0;
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
                if(a_i == a_j)
                    primary = primary + a[a_i][a_j];
                if((a_i + a_j) == n-1)
                   secondary = secondary+a[a_i][a_j];
            }                                                 
        }      
        System.out.print(Math.abs(primary-secondary)); 
        in.close();
    }
}
