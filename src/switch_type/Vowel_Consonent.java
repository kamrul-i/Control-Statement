package switch_type;

import java.util.Scanner;

public class Vowel_Consonent {
	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			
			char c ;
			System.out.print("Enter any letter : ");
			c = input.next().charAt(0);
			
			switch (c) {
				case 'a', 'A' -> System.out.println("vowel");
				case 'e', 'E' -> System.out.println("vowel");
				case 'i', 'I' -> System.out.println("vowel");
				case 'o', 'O' -> System.out.println("vowel");
				case 'u', 'U' -> System.out.println("vowel");
				
				case 'b', 'B' -> System.out.println("consonent");
				case 'c', 'C' -> System.out.println("consonent");
				case 'd', 'D' -> System.out.println("consonent");
				case 'f', 'F' -> System.out.println("consonent");
				case 'g', 'G' -> System.out.println("consonent");
				case 'h', 'H' -> System.out.println("consonent");
				case 'j', 'J' -> System.out.println("consonent");
				case 'k', 'K' -> System.out.println("consonent");
				case 'l', 'L' -> System.out.println("consonent");
				case 'm', 'M' -> System.out.println("consonent");
				case 'n', 'N' -> System.out.println("consonent");
				case 'p', 'P' -> System.out.println("consonent");
				case 'q', 'Q' -> System.out.println("consonent");
				case 'r', 'R' -> System.out.println("consonent");
				case 's', 'S' -> System.out.println("consonent");
				case 't', 'T' -> System.out.println("consonent");
				case 'v', 'V' -> System.out.println("consonent");
				case 'w', 'W' -> System.out.println("consonent");
				case 'x', 'X' -> System.out.println("consonent");
				case 'y', 'Y' -> System.out.println("consonent");
				case 'z', 'Z' -> System.out.println("consonent");
				
				default -> System.out.println("Sorry ! you haven't written any letter.");
			}
		}
	}

}
