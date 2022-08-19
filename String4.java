package iNeuronasnmt;

import java.util.Scanner;

public class String4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter String to check if it is PANGRAM: ");
		String str1 = sc.nextLine();
		str1 = str1.toLowerCase();
		str1 = str1.replace(" ", "");
		char a[] = str1.toCharArray();
		int tmp,flag = 0;
		String str2 = "";
		
		for(int i=0;i<str1.length();i++) {
			if(Character.isLetter(str1.charAt(i))) {
				flag=0;
			}
			else {
				
				flag = -1;
				break;
			}
		}
		
		if(flag==0) {
		//getting all characters of string without repeating
			if(str1.length()>=26) {
				for(int i=0;i<a.length;i++) {
					for(int j=i+1;j<a.length;j++) {
						if(a[i]==a[j]) {
							a[j] = '1';
							str2 = str2+a[i];
						}					
					}
				}
				
				
			}
			else {
				System.out.println("as number of characters less than 26 it will not be a PANGRAM");
			}
	
	/*
			System.out.println("all characters");
			for(int i=0;i<a.length&&a[i]!='1';i++) {
				System.out.print(a[i]);
			}
	*/		
			for(int i=0;i<a.length;i++) {
				for(int j=i+1;j<a.length;j++) {
					if(a[i]>a[j]) {
						tmp = a[i];
						a[i] = a[j];
						a[j] = (char) tmp;
					}
				}
			}
			
			//System.out.println("sorted");
	/*
			for(int i=0;i<a.length;i++) {
				System.out.print(a[i]);
			}
	*/
			
			str1 = new String(a);
			str1 = str1.replace("1","");
			System.out.println(str1);
			
			
			//checking if substring exits
			int res = str1.indexOf("abcdefghijklmnopqrstuvwxyz");
			//System.out.println(res);
			if(res!=-1) {
				System.out.println("given string is PANGRAM");
			}
			else{
				System.out.println("given string is not PANGRAM");
			}
			
		}
		else {
			System.out.println("only letters allowed");
		}
	}

}
