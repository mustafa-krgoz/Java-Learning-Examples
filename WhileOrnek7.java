import java.util.Scanner;

public class WhileOrnek7 {

	public static void main(String[] args) {
		// �sl� say� hesaplama
		
	Scanner klavye = new Scanner(System.in);
		System.out.print("�ss� al�nacak say�y� giriniz:");
			int sayi1 = klavye.nextInt();
		System.out.print("�s olacak say�y� giriniz:");
			int sayi2 = klavye.nextInt();
			int sonuc = 1;
			int i = 1;
		while(i<=sayi2) {
			sonuc = sonuc*sayi1;
			i++;
		}
		System.out.print("Cevap:" + sonuc);
	}

}
