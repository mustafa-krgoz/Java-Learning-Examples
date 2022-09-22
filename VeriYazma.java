import java.io.*;
public class VeriYazma {

	public static void main(String[] args)  throws IOException{
			File dosya = new File("puan listesi.txt");
			if(dosya.exists()) {
				System.out.println("Dosya mevcut");
				System.exit(1);
			}
		// Dosya oluþturma
			PrintWriter cikis = new PrintWriter(dosya);
		// Dosya yazma
			cikis.print("Mustafa Karagöz Algoritma");
			cikis.println(75);
			cikis.print("Ahmet Yeþeriroðlu Algoritma");
			cikis.println(40);
		// Dosya kapatma
			cikis.close();
			
		
			
				

	}

}
