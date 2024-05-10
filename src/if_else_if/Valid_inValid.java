package if_else_if;

import java.util.Scanner;

public class Valid_inValid {
	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			
			//=====================================================
	        int age;
	        System.out.print("Enter any age : ");
	        age = input.nextInt();
	        
	        if(age>17){
	            System.out.print("Valid Voter");
	        }else{
	            System.out.print("inValid Voter");
	            
	        }
			//=====================================================
		
			System.out.println("\n\n");
		}
	}

}
