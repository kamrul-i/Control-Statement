package if_else_if;

import java.util.Scanner;

public class Valid_inValid {
	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			
			//=====================================================
			int number;
			System.out.print("Enter any number : ");
			number = input.nextInt();
			
			
			//positive-negative select =====================
			if(number > 0) {
				System.out.println(number + " is positive number.");
			}else {
				System.out.println(number + " is negative number.");
			}
			//=======================================================
		}
	}

}
