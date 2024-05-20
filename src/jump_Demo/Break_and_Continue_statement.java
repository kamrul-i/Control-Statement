package jump_Demo;

public class Break_and_Continue_statement {

	public static void main(String[] args) {


		
		
		
		//--------------------------------------
		for(int i=1; i<=100; i++) {
			if(i==10) {
				continue;
			}
			System.out.println(i);
		}
		//--------------------------------------
		//if statement-এ i-এর মান যত থাকবে, সেটা বাদ দিয়ে, কাঙ্কিত loop পর্যন্ত চলতে থাকবে।।
		System.out.println();
		
		
		
		
		//--------------------------------------
		for(int i=1; i<=50; i=i+3) {
			if(i==10) {
				continue;
			}
			System.out.println(i);
		}
		//--------------------------------------
		//if statement-এ i-এর মান যত থাকবে, সেটা বাদ দিয়ে, কাঙ্কিত loop পর্যন্ত চলতে থাকবে।। 
		// তবে সেটা তার হিসেবের মধ্যে না পেলে function কোন সংখ্যা বাদ দিবে না।।
		System.out.println();
		
		
		
		
		
		//--------------------------------------
		for(int i=1; i<=50; i=i+3) {
			if(i==10) {
				continue;
			}
			
			if(i>13) {
				break;
			}
			System.out.println(i);
		}
		//if statement-এ i-এর মান যত থাকবে, সেটাকে break করে তারপর continue করবে, 
		//তবে পরের if statement-এ i-এর মান 13 থেকে বড় হলে break করবে।।
		//--------------------------------------	
		
	}
}
