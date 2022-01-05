import java.util.Scanner;

public class KullaniciGirisi {

	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
		System.out.print("Kullanýcý adýný giriniz:");
			String k_adi = input.nextLine();
		System.out.print("Parola giriniz:");
			String parola = input.nextLine();
			
	if(k_adi.equals("Java") && parola.equals("123")) {
		System.out.println("Baþarýlý bir giriþ yaptýnýz!");
	}
	else {
		System.out.println("Kullanýcý adýnýz veya parolanýz yanlýþ!");
	}
	

	}

}
