import java.util.Scanner;

public class WhileOrnek3 {

	public static void main(String[] args) {
		// Girilen say�ya kadar olan 2'nin kuvvetleri
		
	Scanner input = new Scanner(System.in);
		System.out.print("L�tfen bir say� giriniz:");
			int sayi = input.nextInt();
			int k = 1;
		while(k<=sayi) {
			System.out.println(k);
			k = k*2;
		}

	}

}
