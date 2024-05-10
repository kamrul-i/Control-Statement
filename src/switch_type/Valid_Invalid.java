package switch_type;

import java.util.Scanner;

public class Valid_Invalid {

	public static void main(String[] args) {

		try (Scanner input = new Scanner(System.in)) {
			
			//=====================================================
			char c;
			System.out.print("Do you love Java ? : ");
			c = input.next().charAt(0);
			
			switch(c) {
			case 'y', 'Y' -> System.out.println("You are Java lover !");
			case 'n', 'N' -> System.out.println("You are not a java lover.");
			default -> System.out.println("Smilling !");
			}
			//=======================================================
		}
	}

}
