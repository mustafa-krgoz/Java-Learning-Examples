import java.util.Scanner;

public class WhileOrnek5 {

	public static void main(String[] args) {
		// Harmonik sayý
		
	Scanner scan = new Scanner(System.in);
	  System.out.print("Sayý giriniz:");
		double sayi = scan.nextDouble();
		double harmonik = 0.0;
	 while(sayi>0) {
		 harmonik = harmonik + (1/sayi);		 
		 sayi--;
	 }
	  System.out.println(harmonik);	
	 
	}

}
