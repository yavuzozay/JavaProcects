package DortIslem;

public class CarpmaStratejisi implements IslemStrateji {

	@Override
	public double Hesapla(int sayi1, int sayi2) {
		double sonuc=sayi1*sayi2;
		return sonuc;
	}

}
