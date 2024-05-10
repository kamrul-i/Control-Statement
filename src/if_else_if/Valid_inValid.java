package if_else_if;

import java.util.Scanner;

public class Valid_inValid {
	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			
			//=====================================================
			char c;
			System.out.print("Do you love Java ? : ");
			c = input.next().charAt(0);
			
			if(c == 'y' || c == 'Y') {
				System.out.print("You are a Java lover.");
			}else if(c == 'n'  || c == 'N'){
				System.out.print("You are not Java lover !");
			}else {
				System.out.print("Smilling !");
			}
			//=======================================================
		}
	}

}
