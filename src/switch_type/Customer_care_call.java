package switch_type;

import java.util.Scanner;

public class Customer_care_call {
	public static void main(String[] args) {
		
		
		//======================================================
		try (Scanner input = new Scanner(System.in)) {
			
			int num;
			System.out.print("Enter any Disit : ");
			num = input.nextInt();
			
			switch(num){
			    case 0:
			        System.out.println("Welcome to our call centre.");
			        break;
			    case 1:
			        System.out.println("Selected language is Bangali.");
			        break;
			    case 2:
			        System.out.println("Selected language is Arabic.");
			        break;
			    case 3:
			        System.out.println("Selected language is English");
			        break;
			    default:
			        System.out.println("Sorry ! you have selected the wrong number.");
			}
			
			System.out.println();
			
			//-------------------------------------------------------
			int number;
			System.out.print("Enter any Disit : ");
			number = input.nextInt();
			
			switch(number){
			    case 0 -> System.out.println("Welcome to our call centre.");
			    case 1 -> System.out.println("Selected language is Bangali.");
			    case 2 -> System.out.println("Selected language is Arabic.");
			    case 3 -> System.out.println("Selected language is English");
			    default -> System.out.println("Sorry ! you have selected the wrong number.");
			}
			//=======================================================
			
		}
		
	}
	

}
