import java.util.Scanner;

public class KardesYasi {

	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
		System.out.print("Birinci karde�in ya��n� giriniz:");
			int sayi1 = input.nextInt();
		System.out.print("�kinci karde�in ya��n� giriniz:");
			int sayi2 = input.nextInt();
			double ortalama;
			int toplam;
		toplam = sayi1 + sayi2;
		ortalama = (sayi1+sayi2)/2;
		System.out.print("Karde�lerin ya�lar� toplam�:" + toplam + "\n"
				+ "Karde�lerin ya� ortalamas�:" + ortalama);
		

	}

}
