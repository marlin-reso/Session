package session01;

import java.util.Scanner;

public class ProfitAndLoss {

	public static void main(String[] args) {
		
		System.out.println("Enter the Cost Price of the Product : ");
		
		Scanner sc = new Scanner(System.in);
		int cost = sc.nextInt();
		
		System.out.println("Enter the Selling price of the product : ");
		int selling = sc.nextInt();
		
		if(cost>selling) {
			
			int totalLoss = cost-selling;
			System.out.println("Total loss is : "+totalLoss+" Rs.");
			
			int loss = (cost-selling)  *100 /cost;
			System.out.println("Loss is : "+loss+"%");
		}
		
		else if(selling>cost) {
			
			int totalProfit = selling-cost;
			System.out.println("Total profit is : "+totalProfit+" Rs." );
			
			int profit = (selling-cost)*100/cost;
			System.out.println("Profit is : "+profit+"%");
			
		}
	}

}
