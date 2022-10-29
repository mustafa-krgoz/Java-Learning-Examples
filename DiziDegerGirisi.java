import java.util.Scanner;

public class DiziDegerGirisi {

	public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
	  double[] benimDizi = new double[5];
	  
	  System.out.println("Lütfen " + benimDizi.length + " sayý giriniz: ");
	  	for(int i=0; i< benimDizi.length; i++) {
	  		benimDizi[i] = scan.nextDouble();
	  System.out.print(benimDizi[i] + " ");	
	  	}
	  

	}

}
