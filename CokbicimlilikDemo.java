
public class CokbicimlilikDemo {

	public static void main(String[] args) {
		// �ember ve dikd�rtgen �zelliklerini g�ster.
		nesneGoster(new TemelGeometrikSekildenCember(1, "k�rm�z�", false));
		nesneGoster(new TemelGeometrikSekildenDikdortgen(1, 1, " siyah " ,true));
		

	}
	// Geometrik nesne �zelliklerini g�ster.
	public static void nesneGoster(TemelGeometrikSekil nesne) {
		System.out.println(nesne.getOlusturulmaTarihi() + " tarihinde nesne olu�turuldu. Rengi " + nesne.getRenk()
		+ " d�r.");
	}

}
