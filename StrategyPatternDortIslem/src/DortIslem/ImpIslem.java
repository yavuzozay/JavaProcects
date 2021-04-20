package DortIslem;

public class ImpIslem {
	IslemStrateji islemStrateji;
	public ImpIslem(IslemStrateji islemStrateji)
	{
		this.islemStrateji=islemStrateji;
	}
	public double hesaplaImp(int sayi1,int sayi2)
	{
	  return islemStrateji.Hesapla(sayi1, sayi2);
	}

}
