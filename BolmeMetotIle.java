import java.util.Scanner;

public class BolmeMetotIle {
	public static int bolme(int sayi1, int sayi2) {
		if(sayi2==0) {
			System.out.println("Bölen sýfýr olamaz.");
			System.exit(1);
		}	
			return sayi1/sayi2;
	}
		
	

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		
		System.out.print("Lütfen iki tamsayý giriniz:");
		int sayi1 = giris.nextInt();
		int sayi2 = giris.nextInt();
		
		int sonuc = bolme(sayi1, sayi2);
		System.out.println(sayi1 + " / " + sayi2 + " = " + sonuc + " dir.");
		
		
		

	}

}
