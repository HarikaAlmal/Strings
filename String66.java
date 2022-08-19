                                                                                                        
//6. WAP to sort a String Alphabetically.                                                               
                                                                                                        
package iNeuronasnmt;                                                                                   
                                                                                                        
import java.util.Scanner;                                                                               
                                                                                                        
public class String66 {                                                                                  
                                                                                                        
	public static void main(String[] args) {                                                            
		// TODO Auto-generated method stub                                                              
		System.out.println("enter string to sort alphabetically: ");                                    
		Scanner sc = new Scanner(System.in);                                                            
		String str = sc.nextLine();                                                                     
		str = str.toLowerCase();                                                                        
		int i =0, j =0 , tmp = 0;                                                                       
		char a[] = str.toCharArray();                                                                   
		                                                                                              
		                                                                                                
		for(i=0;i<a.length;i++) {                                                                       
			for(j=i+1;j<a.length;j++) {                                                                 
				if(a[i]>a[j]) {                                                                         
					tmp = a[i];                                                                         
					a[i]= a[j];                                                                         
					a[j]= (char) tmp;                                                                   
				}                                                                                       
			}	                                                                                        
		}                                                                                               
		//for(i=0;i<a.length;i++) {                                                                     
		//	System.out.print(a[i]);                                                                     
		//}                                                                                             
		//System.out.println(str);                                                                      
		String s = new String(a);                                                                       
		System.out.println(s);                                                                          
	}                                                                                                   
                                                                                                        
}                                                                                                       
                                                                                                        