package if_else_if;

import java.util.Scanner;

public class Valid_inValid {
	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			
			//=====================================================
			int number;
			System.out.print("Enter any number : ");
			number = input.nextInt();
			
			
			//even-odd & positive-negative select =====================
			if(number > 0  && number % 2 == 0) {
				System.out.println(number + " is Even & positive number.");
			}else if(number > 0 && number!= 0) {
				System.out.println(number + " is Odd & posative number.");
			}else if(number < 0 && number % 2 == 0) {
				System.out.println(number + " is negative & Even number.");
			}else if(number < 0 && number!= 0){
				System.out.println(number + " is negative & Odd number.");
			}else {
				System.out.print("invalid number !");
			}
			//=======================================================
		}
	}

}
