import java.util.Scanner;

public class WhileOrnek2 {

	public static void main(String[] args) {
		// Negatif bir say� girilene kadar kullan�c�dan giri� alan ve
		// girilen de�erlerden tek say�lar� toplayan program
		
	Scanner scan = new Scanner(System.in);	
		int toplam = 0;
		int sayi;
	  
	 while(true) {
		 System.out.print("L�tfen bir say� giriniz:");
		 	sayi = scan.nextInt();
		 	
		 if(sayi<0) {
			 System.out.println("Program bitti negatif bir say� girdiniz!");
			 break;
		 }
		 
		 if(sayi%2==1) {
			 // toplam = toplam + sayi;
			 toplam+=sayi;
		 }
		 	 
	 }
	 	System.out.print("Tek say�lar�n toplam�:" + toplam);
		
		
	}

}
