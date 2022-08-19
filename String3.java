package iNeuronasnmt;

import java.util.Scanner;

public class String3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter word1: ");
		String str1 = sc.nextLine();
		str1 = str1.toLowerCase();
		str1 = str1.replace(" ", "");
		char a[] = str1.toCharArray();
		
		System.out.println("enter word2: ");
		String str2 = sc.nextLine();
		str2 = str2.toLowerCase();
		str2 = str1.replace(" ", "");
		char b[] = str2.toCharArray();
		
		int tmp;
		
		
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					tmp = a[i];
					a[i] = a[j];
					a[j] = (char) tmp;
				}
			}
		}
		str1 = new String(a);
		//System.out.println(str1);
		
		
		
		for(int i=0;i<b.length;i++) {
			for(int j=i+1;j<b.length;j++) {
				if(b[i]>b[j]) {
					tmp = b[i];
					b[i] = b[j];
					b[j] = (char) tmp;
				}
			}
		}
		str2 = new String(b);
		//System.out.println(str1);
		
		
		
		if(str1.equalsIgnoreCase(str2)) {
			System.out.println("anagram");
		}
		else {
			System.out.println("not");
		}
		
	}
}
