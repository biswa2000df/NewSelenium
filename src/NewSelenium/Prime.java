package NewSelenium;

import java.util.Scanner;

public class Prime {
	
     public static void main(String[] args) {
		
    	int i,m,flag=0;
    	//Scanner sc=new Scanner(System.in);
    	System.out.println(" user input ");
    	int n=5;//sc.nextInt();
    	if(n==0||n==1) {
    		
    		System.out.println("this number is not a prime number ");
    	}
    	for(i=2;i<n;i++) {
    		
    		
    		if(n%i==0) {
    			
    			System.out.println( n+" "+"is   not a prime number ");
    			flag=1;
    			break;
    		}
    	}
    	if(flag==0) {
    		
    		System.out.println(n +" "+ " is a prime number ");
    	}
    	//sc.close();
    	
     }
}
