
public class Siniflar {
	//Constructor(Yap�c�)

	public static void main(String[] args) {
		
	 HesapMakinesi m1 = new HesapMakinesi(10, 5, "beyaz");
		
		System.out.println(m1.sayi1);
		System.out.println(m1.sayi2);
		m1.sayi1 = 8;
		System.out.println(m1.sayi1);
		System.out.println(m1.renk);
		System.out.println(m1.cikarma());
		System.out.println(m1.carpma());
		
		
	 HesapMakinesi m2 = new HesapMakinesi(7,6, "k�rm�z�");
	 	System.out.println(m2.toplama());
	 	System.out.println(m2.renk);
		
		

	}

}
