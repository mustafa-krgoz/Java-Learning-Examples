import java.util.Scanner;

public class WhileOrnek4 {

	public static void main(String[] args) {
		// Fakt�riyel Hesaplama
		
	Scanner input = new Scanner(System.in);
		System.out.print("Fakt�riyeli hesaplanacak say�y� giriniz:");
			int sayi = input.nextInt();
			int sonuc = 1;
		while(sayi>0) {
			sonuc = sonuc*sayi;
			sayi--;		
		}
		System.out.print("Fakt�riyelin sonucu:" + sonuc);
	}

}
