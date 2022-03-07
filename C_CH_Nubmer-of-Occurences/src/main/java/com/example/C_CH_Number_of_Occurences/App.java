package com.example.C_CH_Number_of_Occurences;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String word;
		int i , length;
		int counter[] = new int[256];

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Word : ");
		word = sc.nextLine();
		
		//converting the input word into lowercase
		/* char[] s1 = word.toCharArray();
		int diff = 'a' - 'A';
		
		for(int x=0 ; x<s1.length ; x++){
			if(s1[x] >= 'A' && s1[x] <= 'Z'){
				s1[x] += diff;
			}
		}
		
		System.out.println(s1);
		 */
		 
		length = word.length();
		
		//count the occurrence of each character & store it in array
		for(i=0 ; i<length ; i++)
		{
			counter[(int) word.charAt(i)]++;	
		}
		
		//print the number of occurrences of characters
		for(i=0 ; i<256 ; i++)
		{
			if(counter[i] != 0){
				System.out.println((char) i + " ---> " + counter[i]);
			}
		}
		
    }
}
