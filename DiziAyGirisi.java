import java.util.Scanner;

public class DiziAyGirisi {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		String[] aylar = { "Ocak" , "�ubat" , "Mart" , "Nisan"
		, "May�s" , "Haziran" , "Temmuz" , "A�ustos" , "Eyl�l" , "Ekim" , "Kas�m" , "Aral�k"};
		
		System.out.print("Bir ay no giriniz(1-12): ");
		int ayNo = giris.nextInt();
		System.out.println("Ay: " + aylar[ayNo-1]);
		
		

	}

}
