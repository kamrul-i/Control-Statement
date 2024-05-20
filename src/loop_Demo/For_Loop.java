package loop_Demo;

public class For_Loop {
	public static void main(String[] args) {
		
		
		//একই word/sentence কে যতবার print করতে চান, এই loop টি ব্যবহার করুন।।
		for (int  i=1;  i<=5;  i++){
            System.out.println("Bangladesh");
        }
		
		System.out.printf("\n");
        
		
		
		//কতবার print হয়েছে, তার পাশে serial number দেখতে চান, এই loop টি ব্যবহার করুন।।
        for (int  i=1;  i<=7;  i++){
            System.out.println(i+" Bangladesh");
        }
        System.out.println();
        
        
        
        //মনে করেন, আপনি (১-৫০) পর্যন্ত গণনা লিখবেন, এই loop টি ব্যবহার করুন।।
        for (int   i=1;  i<=50;  i++){
            System.out.println(i);    
        }
        System.out.println();
        
        
        
      //আবার মনে করেন, আপনি (২০-১) পর্যন্ত গণনা লিখবেন, এই loop টি ব্যবহার করুন।।
        for (int i = 20; i>=1; i--){
            System.out.println(i);
        }
        System.out.println();
        
        
        
        
        //জোড় সংখ্যা গণনা করতে চাইলে, এই loop টি ব্যবহার করুন।।
        for (int   i=2;  i<=20;  i=i+2){
            System.out.println(i);
        }
        System.out.println();
        
        
        
        
        //বিজোড় সংখ্যা গণনা করতে চাইলে, এই loop টি ব্যবহার করুন।।
        for (int   i=1;  i<=20; i=i+2){
            System.out.println(i);
        }
        System.out.println();

	}

}
