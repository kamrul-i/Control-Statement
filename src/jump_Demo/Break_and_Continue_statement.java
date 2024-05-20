package jump_Demo;

public class Break_and_Continue_statement {

	public static void main(String[] args) {
		

		//--------------------------------------
		for(int i=1; i<=100; i++) {
			
			if(i==10) {
				break;
			}
			System.out.println(i);
		}
		//--------------------------------------
		//if statement-এ i-এর মান যত থাকবে, সে পর্যন্ত গিয়ে থেমে যাবে।। যদিও for-loop-এ 100 পর্যন্ত বলা হয়েছে।।
		System.out.println();
		
		
		
		
		//--------------------------------------
		for(int i=1; i<=100; i=i+2) {
			
			if(i==10) {
				break;
			}
			System.out.println(i);
		}
		//--------------------------------------
		//if statement-এ i-এর মান যত থাকবে, সে পর্যন্ত গিয়ে থেমে যাওয়ার কথা, তবে এটাতে থামলো না কেন ?
		//if statement-এ i-এর মান যত থাকবে, সেটা যদি তার হিসেবের মধ্যে না পায়, তাহলে কাঙ্কিত loop পর্যন্ত চলতে থাকবে।।
		System.out.println();
		
		

		
	}
}
