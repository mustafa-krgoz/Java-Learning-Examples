
public class BicimDemosu {

	public static void main(String[] args) {
		
	//Tablonun baþlýðýný gösterme	
	System.out.printf("%-10s %-10s %-10s %-10s %-10s\n" , "Derece" , "Radyan", "Sinüs"
			,"Cosinüs", "Tanjant");
	
	// 30 derece için deðer gösterimi
	int derece = 30;
	double radyan = Math.toRadians(derece);
	System.out.printf("%-10d %-10f %-10f %-10f %-10f\n" , derece, radyan, Math.sin(radyan)
			, Math.cos(radyan), Math.tan(radyan));
		
	// 60 derece için deðer gösterimi
	derece = 60;
	radyan = Math.toRadians(derece);
	System.out.printf("%-10d %-10f %-10f %-10f %-10f\n" , derece, radyan, Math.sin(radyan)
			, Math.cos(radyan), Math.tan(radyan));
		
		
		
		

	}

}
