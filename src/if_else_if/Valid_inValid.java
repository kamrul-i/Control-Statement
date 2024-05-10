package if_else_if;

import java.util.Scanner;

public class Valid_inValid {
	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			
			//=====================================================
			//manage condition, who is valid voter.================
			int age;
			System.out.print("Please, Enter your age : ");
			age = input.nextInt();
			
			if(age > 17) {
				System.out.println("You are "+age+" years old. You are Valid Voter.");
			}else {
				System.out.println("You are "+age+" years old. You are inValid Voter.");
			}
			//=======================================================
		}
	}

}
