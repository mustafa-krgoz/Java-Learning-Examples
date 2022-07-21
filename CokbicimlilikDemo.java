
public class CokbicimlilikDemo {

	public static void main(String[] args) {
		// Çember ve dikdörtgen özelliklerini göster.
		nesneGoster(new TemelGeometrikSekildenCember(1, "kýrmýzý", false));
		nesneGoster(new TemelGeometrikSekildenDikdortgen(1, 1, " siyah " ,true));
		

	}
	// Geometrik nesne özelliklerini göster.
	public static void nesneGoster(TemelGeometrikSekil nesne) {
		System.out.println(nesne.getOlusturulmaTarihi() + " tarihinde nesne oluþturuldu. Rengi " + nesne.getRenk()
		+ " dýr.");
	}

}
