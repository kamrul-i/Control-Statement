package if_else_if;

import java.util.Scanner;

public class Valid_inValid {
	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			
			//=====================================================
			int number;
			
			System.out.print("Enter any number : ");
			number = input.nextInt();
			
			if(number == 1){
			    System.out.print("One");
			}else if(number == 2){
			    System.out.print("Two");
			}else if(number == 3){
			    System.out.print("Three");
			}else if(number == 4){
			    System.out.print("Four");
			}else if(number == 5){
			    System.out.print("Five");
			}else if(number == 6){
			    System.out.print("Six");
			}else if(number == 7){
			    System.out.print("Seven");
			}else if(number == 8){
			    System.out.print("Eight");
			}else if(number == 9){
			    System.out.print("Nine");
			}else{
			    System.out.print("Invalid Number");
			}
			//=====================================================
		}
	}

}
