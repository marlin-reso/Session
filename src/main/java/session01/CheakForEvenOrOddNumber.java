package session01;

import java.util.Scanner;

public class CheakForEvenOrOddNumber {

	public static void main(String[] args) {
		
		System.out.println("Enter the number : ");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num>=100 && num%2==0 ) {
			
			System.out.println(num+ "  is even !! ");
			
		}
		else {
			
			System.out.println(num+" is odd !!");
		}
		
	}

}
