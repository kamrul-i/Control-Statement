package if_else_if;

import java.util.Scanner;

public class Select_Candidate {
	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			String s1;
			String s2;
			
			System.out.print("Have you completed your masters ? ");
			s1 = input.nextLine();
			System.out.print("Are you fluent in english ? ");
			s2 = input.nextLine();
			
			if(("y".equals(s2) && "y".equals(s1))||("Y".equals(s1) && "y".equals(s2))){
			    System.out.print("Thanks ! you are eligible to for the job interview.");
			    
			}else if("Y".equals(s1) && "Y".equals(s2)||("y".equals(s1) && "Y".equals(s2))){
			    System.out.print("Thanks ! you are eligible to for the job interview.");
			    
			}else if(("n".equals(s2) && "n".equals(s1))||("N".equals(s1) && "n".equals(s2))){
			    System.out.print("Sorry, you are not eligible to for the job interview.");
			    
			}else if("N".equals(s1) && "N".equals(s2)||("n".equals(s1) && "N".equals(s2))){
				System.out.print("Sorry, you are not eligible to for the job interview.");
			}else {
				System.out.print("Sorry ! This candidat is absent.");
			}
		}
	}

}
