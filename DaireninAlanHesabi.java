import java.util.Scanner;

public class DaireninAlanHesabi {

	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
		System.out.print("Yar��ap� pozitif tamsay� giriniz:");
			int r = input.nextInt();
			
		if(r<0)
			System.out.println("Yanl�� giri�!");
		else {
			double alan = r*r*3.14159;
			System.out.println("Dairenin Alan�:" + alan);
		}
			

	}

}
