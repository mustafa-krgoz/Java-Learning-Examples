import java.util.Scanner;

public class KullaniciGirisi {

	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
		System.out.print("Kullan�c� ad�n� giriniz:");
			String k_adi = input.nextLine();
		System.out.print("Parola giriniz:");
			String parola = input.nextLine();
			
	if(k_adi.equals("Java") && parola.equals("123")) {
		System.out.println("Ba�ar�l� bir giri� yapt�n�z!");
	}
	else {
		System.out.println("Kullan�c� ad�n�z veya parolan�z yanl��!");
	}
	

	}

}
