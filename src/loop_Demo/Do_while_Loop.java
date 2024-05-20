package loop_Demo;

public class Do_while_Loop {
	public static void main(String[] args) {
		
		
		
		
		//একই word/sentence কে যতবার print করতে চান, এই loop টি ব্যবহার করুন।।
		int i = 1;
        do{
            System.out.println(" kamrul islam");
            i++;
            
        }while (i<=5);
        System.out.println();
        
        
        
		//কতবার print হয়েছে, তার পাশে serial number দেখতে চান, এই loop টি ব্যবহার করুন।।
		int b = 1;
        do{
            System.out.println(b+" kamrul islam");
            b++;
            
        }while (b<=7);
        System.out.println();
        
        
        
        
        //মনে করেন, আপনি (১-৫০) পর্যন্ত গণনা লিখবেন, এই loop টি ব্যবহার করুন।।
        int c = 1;
        do {
        	System.out.println(c);
        	c++;
        }while(c<=20);
        System.out.println();
        
        
        
        
        //আবার মনে করেন, আপনি (২০-১) পর্যন্ত গণনা লিখবেন, এই loop টি ব্যবহার করুন।।
        int d = 20;
        do {
        	System.out.println(d);
        	d--;
        }while(d>=1);
        System.out.println();
        
        
        
        //জোড় সংখ্যা গণনা করতে চাইলে, এই loop টি ব্যবহার করুন।।
        int a = 2;
        do{
            System.out.println(a);
            a = a+2;
            
        }while (a<= 20);
        System.out.println();
        
        
        
        //বিজোড় সংখ্যা গণনা করতে চাইলে, এই loop টি ব্যবহার করুন।।
        int e = 1;
        do{
            System.out.println(e);
            e = e+2;
        }while (e<=30);
        System.out.println();
            
        
	}

}
