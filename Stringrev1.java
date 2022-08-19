
/* program to reverse a string*/




package iNeuronasnmt;

import java.util.Scanner;

public class Stringrev1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = new String("iNeuron");
		String c = "";
		for(int i=s.length()-1;i>=0;i--) {
			c = c+s.charAt(i);
			
		}
		System.out.println(c);
		
		System.out.println("user enter string to reverse: ");
		Scanner sc =new Scanner(System.in);
		String d = sc.nextLine();
		String e = "";
		for(int i=d.length()-1;i>=0;i--) {
			e = e+d.charAt(i);
			
		}
		System.out.println(e);

	}

}
