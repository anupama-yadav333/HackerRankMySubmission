package hackerrank;

import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int count= 0;
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i)!= '\0'){
				if((int)s.charAt(i)>=65 && (int)s.charAt(i)<=90){
					count++;
				}
			}
		}
		System.out.println(count+1);
		sc.close();
	}

}
