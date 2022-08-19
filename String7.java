
//7. WAP to count the number of Vowels and Consonants of a String value.


package iNeuronasnmt;

import java.util.Scanner;

public class String7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vowelcount = 0;
		int consonant = 0;
		Scanner sc= new Scanner(System.in);
		
		String s = sc.nextLine();
		s = s.toLowerCase();
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				 vowelcount++;
			}
			else {
				if(s.charAt(i)>96 && s.charAt(i)<123)
					if(s.charAt(i)==' ') {
						
					}
					else
						consonant++;
			}
		}
		System.out.println("vowel count: " + vowelcount+" " + "consonant count :"+ consonant);

	}

}
