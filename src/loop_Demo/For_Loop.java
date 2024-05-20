package loop_Demo;

import java.util.Scanner;

public class For_Loop {
	public static void main(String[] args) {
		
		
		
		//নিজের সুবিধামতো ধারাবাহিক/ক্রমিক সংখ্যার যোগফল বের করতে এ function ব্যবহার করুন।।
		try (Scanner input = new Scanner(System.in)) {
			
			int sum = 0;
			int m, n;
			System.out.print("Enter first number : ");
			m = input.nextInt();
			
			System.out.print("Enter last number : ");
			n = input.nextInt();
			
			for (int i = m; i <= n; i++) {
			    sum = sum + i;
			}
			System.out.print("The sum is : "+sum);
		}

	}

}
