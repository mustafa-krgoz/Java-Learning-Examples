import java.util.Scanner;
public class Bolme {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
			
		System.out.print("L�tfen iki tamsay� giriniz:");
		int sayi1 = giris.nextInt();
		int sayi2 = giris.nextInt();
		
		if(sayi2 != 0) 
			System.out.println(sayi1 + " / " + sayi2 + " = " + (sayi1/sayi2) + " dir." );
			else
				System.out.println("B�len s�f�r olamaz.");
		
	}

}
