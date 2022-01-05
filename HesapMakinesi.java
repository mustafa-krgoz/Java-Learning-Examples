import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	   System.out.print("Ýlk sayýyý giriniz:");
	   	 int sayi1 = scan.nextInt();
	   System.out.print("Ýkinci sayýyý giriniz:");
	   	 int sayi2 = scan.nextInt();
	   
	   System.out.println("Lütfen yapmak istediðiniz iþlemi seçiniz:");
	   System.out.println("1)Toplama\n2)Çýkarma\n3)Çarpma\n4)Bölme");
	   System.out.print("Seçiminiz:");
	   	 int secim = scan.nextInt();
	   	 
	 if(secim==1) {
		 System.out.println("Toplam:" + (sayi1+sayi2));
	 }
	 else if(secim==2) {
		 System.out.println("Çýkarma:" + (sayi1-sayi2));
	 }
	 else if(secim==3) {
		 System.out.println("Çarpma:" + (sayi1*sayi2));
	 }
	 else if(secim==4) {
		 if(sayi2==0) {
			 System.out.println("Sonuç tanýmsýzdýr!");
		 }
		 else {
			 System.out.println("Bölme:" + (sayi1/sayi2));
		 }
	 }
	 else {
		 System.out.println("Geçersiz bir iþlem girdiniz tekrar deneyiniz!");
	 }
	 
	 
		

	}

}
