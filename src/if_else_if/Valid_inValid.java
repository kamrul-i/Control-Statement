package if_else_if;

import java.util.Scanner;

public class Valid_inValid {
	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			
			//=====================================================
			int number;
			System.out.print("Enter any number : ");
			number = input.nextInt();
			
			
			//even-odd select ============
			if(number % 2 == 0) {
				System.out.println(number + " is Even number.");
			}else {
				System.out.println(number + " is Odd number");
			}
			//=======================================================
		}
	}

}
