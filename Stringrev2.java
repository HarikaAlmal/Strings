package iNeuronasnmt;

import java.util.Scanner;

public class Stringrev2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("enter string to reverse: ");
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = "", str3 = "", str4 = "",rev ="";
		String a[] = str1.split(" ");
//complete reverse
		
/*		for(int i = str1.length()-1;i>=0;i--) {
			str2= str2+str1.charAt(i);
		}
		System.out.print("complete string reverse: ");
		System.out.println(str2);
//words reverse		
		String a[] = str1.split(" ");
		for(int i=a.length-1;i>=0;i--) {
			str3 = str3+a[i]+ " ";
		}
		
		System.out.print("word reverse: ");
		System.out.println(str3);
*/
		
		//System.out.print("str5 ");
//in place word reverse		
		for(int i=0;i<a.length;i++) {
			//System.out.println(a[i]);
			String eachword = a[i];
			//System.out.println(word);
			for(int j = eachword.length()-1;j>=0;j--) {
				 rev = rev + eachword.charAt(j);
			}
			rev = rev+" ";
			
			
		}
		System.out.println(rev);
		
		
		
		
	}

}
