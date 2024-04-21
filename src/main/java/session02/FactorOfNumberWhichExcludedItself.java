package session02;

import java.util.Scanner;

public class FactorOfNumberWhichExcludedItself {

	public static void main(String[] args) {
		
		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int num1=1;num1<num;num1++) {
	//		System.out.print("Factors of number are ");
			if(num%num1==0) {
				System.out.print("\t"+num1);
			}
		}

	}

}
