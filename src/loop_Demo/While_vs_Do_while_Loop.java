package loop_Demo;

public class While_vs_Do_while_Loop {
	public static void main(String[] args) {
		

        int b = 7;
        do{
            System.out.println(" loop");
            b++;
        }while(b <= 5);   
        
        // condition এর মান =5 ধরা হয়েছে, এবং variable এর মান =7 ধরা হয়েছে।।
        // variable এর মান =7 ধরা হলেও function টি ১ বার print হয়েছে।। 
		// "Do-while-loop" function-এ condition থেকে variable এর মান বেশি হলেও, print-এ result ১ বার আসবে।।  
        
	}

}
