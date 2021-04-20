package DortIslem;

public class BolmeStratejisi implements IslemStrateji{

	@Override
	public double Hesapla(int sayi1, int sayi2) {
		double sonuc=0.0;
		if(sayi2==0)
			System.out.println("MATH ERROR:: "+sayi1+" 0a bölünemez!!" );
		else 
			 sonuc=sayi1/sayi2;
		return sonuc;
	}

}
