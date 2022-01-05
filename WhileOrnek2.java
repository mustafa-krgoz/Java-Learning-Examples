import java.util.Scanner;

public class WhileOrnek2 {

	public static void main(String[] args) {
		// Negatif bir sayý girilene kadar kullanýcýdan giriþ alan ve
		// girilen deðerlerden tek sayýlarý toplayan program
		
	Scanner scan = new Scanner(System.in);	
		int toplam = 0;
		int sayi;
	  
	 while(true) {
		 System.out.print("Lütfen bir sayý giriniz:");
		 	sayi = scan.nextInt();
		 	
		 if(sayi<0) {
			 System.out.println("Program bitti negatif bir sayý girdiniz!");
			 break;
		 }
		 
		 if(sayi%2==1) {
			 // toplam = toplam + sayi;
			 toplam+=sayi;
		 }
		 	 
	 }
	 	System.out.print("Tek sayýlarýn toplamý:" + toplam);
		
		
	}

}
