package hackerrank;

import java.util.*;

public class MaximumSubarray {

	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner sc= new Scanner(System.in);
	        int tCase= sc.nextInt();
	        while(tCase > 0){
	            int n= sc.nextInt();
	            int[] ar= new int[n];
	            for(int i=0; i<n; i++){
	               ar[i]= sc.nextInt();
	            }
	            int max_so_far = ar[0];
	            int sum1= 0;
	            int c_sum= 0;
	            for(int i=0; i<n; i++){
	            	sum1 += ar[i];
	            	if(ar[i]>0){
	            		c_sum += ar[i];
	            	}
	            	if(sum1 > max_so_far){
	            		max_so_far= sum1;
	            	}
	            	if(sum1<0){
	            		sum1=0;
	            	}
	            }
	            System.out.print(max_so_far);
	            if(c_sum == 0){
	            	int i=1;
		            c_sum= ar[0];
		            while(n-1>0){
		            	if(ar[i]>c_sum){
		            		c_sum= ar[i];
		            	}
		            	i++;
		            	n--;
		            }
	            }
	            System.out.print(" "+ c_sum +"\n");
	            tCase--;
	       }
	        sc.close();
	   }
}


