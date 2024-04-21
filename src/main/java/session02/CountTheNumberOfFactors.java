package session02;

import java.util.Scanner;

public class CountTheNumberOfFactors {

	public static void main(String[] args) {
		
		int count=0;
		
		System.out.print("Enter the number : ");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int num1=1;num1<num;num1++) {
			
			if(num%num1==0) {
				
		
				count++;
				System.out.println("Factors are : "+num1+"\t");
				
				
			}
			
		}
		System.out.println("Number of Factors are : "+count);

	}

}
