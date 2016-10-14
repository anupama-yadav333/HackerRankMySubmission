package hackerrank;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Pangrams {
	
	public static int getCharacterIndex(char ch){
		int index= -1;
		if(((int)ch)>=65 && ((int)ch)<=90){
			index = (int)ch % 65;
		}
		else if(((int)ch)>=97 && ((int)ch)<=122){
			index = (int)ch % 97;
		}
		else{
			System.out.println("Other than character not accepted");
		}
		return index;
	}
	
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		s = s.replaceAll("\\s", "");
		
		int[] alphaArray = new int[26];
		Arrays.fill(alphaArray, -1);
		int index;
		boolean yes= true;
		
		for(int i=0; i<s.length(); i++){
			index = getCharacterIndex(s.charAt(i));
			alphaArray[index]= index;
		}
		
		for(int i=0; i<alphaArray.length; i++){
			if(alphaArray[i] == -1){
				System.out.println("not pangram");
				yes =false;
				break;
			}
		}
		
		if(yes == true){
			System.out.println("pangram");
		}	
		sc.close();
	}
}
