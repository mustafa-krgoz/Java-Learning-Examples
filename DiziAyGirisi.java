import java.util.Scanner;

public class DiziAyGirisi {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		String[] aylar = { "Ocak" , "Þubat" , "Mart" , "Nisan"
		, "Mayýs" , "Haziran" , "Temmuz" , "Aðustos" , "Eylül" , "Ekim" , "Kasým" , "Aralýk"};
		
		System.out.print("Bir ay no giriniz(1-12): ");
		int ayNo = giris.nextInt();
		System.out.println("Ay: " + aylar[ayNo-1]);
		
		

	}

}
