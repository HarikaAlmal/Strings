

//8. WAP to count number of special characters.

package iNeuronasnmt;

import java.util.Scanner;

public class String8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter string to count spcl characters: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str = str.toLowerCase();
		//str = str.trim();
		str = str.replace(" ","");
		//System.out.println(str.replace(" ",""));
		int count = 0;
		for(int i=0;i<str.length();i++) {
			if((str.charAt(i)>96&&str.charAt(i)<123)||(str.charAt(i)>47&&str.charAt(i)<58)) {
				
			}
			else {
				count++;
				System.out.println(str.charAt(i));
			}
			
		}
		System.out.print("special char count: ");
		System.out.println(count);
		
		

	}//kmjnhbgvfdre45678 jhgfrde45678ui

}//||str.charAt(i)!=' '
