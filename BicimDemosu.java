
public class BicimDemosu {

	public static void main(String[] args) {
		
	//Tablonun ba�l���n� g�sterme	
	System.out.printf("%-10s %-10s %-10s %-10s %-10s\n" , "Derece" , "Radyan", "Sin�s"
			,"Cosin�s", "Tanjant");
	
	// 30 derece i�in de�er g�sterimi
	int derece = 30;
	double radyan = Math.toRadians(derece);
	System.out.printf("%-10d %-10f %-10f %-10f %-10f\n" , derece, radyan, Math.sin(radyan)
			, Math.cos(radyan), Math.tan(radyan));
		
	// 60 derece i�in de�er g�sterimi
	derece = 60;
	radyan = Math.toRadians(derece);
	System.out.printf("%-10d %-10f %-10f %-10f %-10f\n" , derece, radyan, Math.sin(radyan)
			, Math.cos(radyan), Math.tan(radyan));
		
		
		
		

	}

}
