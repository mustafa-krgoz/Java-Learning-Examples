import java.io.*;
public class VeriYazma {

	public static void main(String[] args)  throws IOException{
			File dosya = new File("puan listesi.txt");
			if(dosya.exists()) {
				System.out.println("Dosya mevcut");
				System.exit(1);
			}
		// Dosya olu�turma
			PrintWriter cikis = new PrintWriter(dosya);
		// Dosya yazma
			cikis.print("Mustafa Karag�z Algoritma");
			cikis.println(75);
			cikis.print("Ahmet Ye�eriro�lu Algoritma");
			cikis.println(40);
		// Dosya kapatma
			cikis.close();
			
		
			
				

	}

}
