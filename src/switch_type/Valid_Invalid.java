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
			case 'y':
			case 'Y':
				System.out.print("You are a Java lover !");
				break;
			
			case 'n':
			case 'N':
				System.out.print("You are not Java lover !");
				break;
				
			default:
				System.out.print("Smilling !");
				break;
		}
			//=======================================================
		}
	}

}
