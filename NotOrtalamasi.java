import java.util.Scanner;

public class NotOrtalamasi {

	public static void main(String[] args) {
		//  not ortalamas�n� hesaplay�n�z.
	
	Scanner input = new Scanner(System.in);
		System.out.print("Vize notunu giriniz:");
			int vize = input.nextInt();
		System.out.print("Final notunu giriniz:");
			int ffinal = input.nextInt();
			double ortalama;
			
		ortalama = (vize*0.4 + ffinal*0.6);
		System.out.println("Ortalaman�z:" + ortalama);
		
	if(ortalama>=50) {
		System.out.println("Ge�tiniz!");
	}
	else {
		System.out.println("Kald�n�z!");
	}
		
		
	}

}
