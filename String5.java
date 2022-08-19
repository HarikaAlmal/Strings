//5. WAP to print repeatedly occurring characters in the given String.

package iNeuronasnmt;

import java.util.Scanner;

public class String5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter string to sort alphabetically: ");                                    
		Scanner sc = new Scanner(System.in);                                                            
		String str = sc.nextLine(),s = ""; 
		char[] a = str.toCharArray(),b[];
		int i=0, j=0,tmp,count=0;
		for(i=0;i<a.length;i++) {
			count=0;
			for(j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
					a[j]='1';
					 s = s+a[i];
					
				}
				
			}
			if(count>0&&a[i]!='1') { 
				System.out.println(a[i]);
			}
		}
		//System.out.println(s);
	

	}

}
