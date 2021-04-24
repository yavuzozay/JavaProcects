package pck;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class VerileriOku {
	
	private final int satirSayisi=12;
	private int[]degerler=new int[satirSayisi];
	
	VerileriOku()
	{
		Oku();		
	}
	public int[] getDegerler()
	{
		
		return degerler;
	}
	public int getSatirSayisi( )
	{
		
		return satirSayisi;
	}

	
	int sayac=0;
	private void Oku()
	{
		
		try {
			Scanner input=new Scanner(new File("src/degerler.txt"));
			
			while(input.hasNext())
			{
				degerler[sayac]=input.nextInt();
				
				sayac++;
			}
			
		} catch (Exception e) {
			
		}
		//satirSayisi=indis;
	}
	

}
