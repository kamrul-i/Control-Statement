package loop_Demo;

public class While_vs_Do_while_Loop {
	public static void main(String[] args) {
		
		
        //Compare with 'while loop' & 'do while loop'
		//While-loop_vs_Do-while-Loop এর মধ্যে পার্থক্য print করে দেখানো হয়েছে।।
        
		//------------------------------------------
        int p = 6;
        while(p <= 5){
            System.out.println("loop");
            p++;
        }
        System.out.println();
        //------------------------------------------

        int b = 7;
        do{
            System.out.println(" loop");
            b++;
        }while(b <= 5); 
        //------------------------------------------
        

        //'while loop' & 'do while loop' এর মধ্যে পার্থক্য হলো-
		// "while loop" function-এ condition থেকে variable এর মান বেশি হলে, print-এ কোন result আসবে না।।
		// "Do-while-loop" function-এ condition থেকে variable এর মান বেশি হলেও, print-এ result ১ বার আসবে।। 
        
        
	}

}
