package loop_Demo;

public class While_Loop {
	public static void main(String[] args) {
		
		
		//একই word/sentence কে যতবার print করতে চান, এই loop টি ব্যবহার করুন।।
        int a = 1;
        while (a<=10){
            System.out.println(" Kamrul islam");
            a++;
        }
        System.out.println();
        
        
        //কতবার print হয়েছে, তার পাশে serial number দেখতে চান, এই loop টি ব্যবহার করুন।।
        int b = 1;
        while ( b<=10 ){
            System.out.println(b+"  Kamrul islam");
            b++;
        }
        System.out.println();
        
        
        
        //মনে করেন, আপনি (১-৫০) পর্যন্ত গণনা লিখবেন, এই loop টি ব্যবহার করুন।।
        int c = 1;
        while (c<=50) {
        	System.out.println(c);
        	c++;
        }
        System.out.println();
        
        
        
        //আবার মনে করেন, আপনি (২০-১) পর্যন্ত গণনা লিখবেন, এই loop টি ব্যবহার করুন।।
        int d = 10;
        while (d>=1){
            System.out.println(d);
            d--;
        }
        System.out.println();
        
        
        
        
        //জোড় সংখ্যা গণনা করতে চাইলে, এই loop টি ব্যবহার করুন।।
        int e = 2;
        while (e<=10){
            System.out.println(e);
            e=e+2;
        }
        System.out.println();
        
        
        
        //বিজোড় সংখ্যা গণনা করতে চাইলে, এই loop টি ব্যবহার করুন।।
        int f = 1;
        while(f < 20) {
        	System.out.println(f);
        	f = f+2;
        }
        System.out.println();
        

	}

}
