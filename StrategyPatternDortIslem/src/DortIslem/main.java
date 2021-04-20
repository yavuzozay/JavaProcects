package DortIslem;

import java.util.Scanner;

public class main {

	private static int sayi1,sayi2=0;
	public static void main(String[] args) {
		ImpIslem topla= new ImpIslem(new ToplamaStretejisi());
		ImpIslem cikar= new ImpIslem(new CikarmaStratejisi());
		ImpIslem carp= new ImpIslem(new CarpmaStratejisi());
		ImpIslem bol= new ImpIslem(new BolmeStratejisi());
		
		DegerleriAl();
		System.out.println();
		System.out.println(sayi1+" + "+sayi2+" = "+topla.hesaplaImp(sayi1, sayi2));
		System.out.println(sayi1+" - "+sayi2+" = "+ cikar.hesaplaImp(sayi1, sayi2));
		System.out.println(sayi1+" X "+sayi2+" = "+ carp.hesaplaImp(sayi1, sayi2));
		System.out.println(sayi1+" : "+sayi2+" = "+ bol.hesaplaImp(sayi1, sayi2));
		
	
	}	
	private static void DegerleriAl()
	{
		
		Scanner input=new Scanner(System.in);
		System.out.println("Sayi1'i giriniz");
		sayi1=input.nextInt();
		System.out.println("Sayi2'yi giriniz");
		sayi2=input.nextInt();
	}


}
