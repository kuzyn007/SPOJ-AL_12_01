/**
 * Autor kodu: Sewery Adamczyk
 * Pochodzenie: http://pl.spoj.com/problems/AL_12_01/
 */

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = readInt(br); //Liczba testow
		//System.out.println(t);
		
		for(int i=0; i<t; i++)
		{		
			
			int pietra = readInt(br); //ilosc pieter w jednym tescie
			//System.out.println(pietra);
			int znak = br.read(); //znak ktory pokazuje kierunek ruchu windy
			
			int pozycja=0;
			int maxG=0;
			int maxD=0;
						
			while (znak!='U' && znak!='D')
			{
				znak = br.read();
			}
			while (znak=='U' || znak=='D')
			{
				if(znak=='U')
				{
					pozycja+=1;
					if(maxG<pozycja)
					{
						maxG=pozycja;
					}
						
				}
				if(znak=='D')
				{
					pozycja-=1;
					if(maxD>pozycja)
					{
						maxD=pozycja;
					}
				}
				//System.out.println("POZYCJA PO KA¯DYM RUCHU WINDY: " + pozycja);
				//System.out.println(maxD + ", " + maxG);
				znak = br.read();
			}
			int wynik = Math.abs(maxD)+Math.abs(maxG);
			//System.out.println("POZYCJA: " + wynik);
			if(pietra>wynik)
			{
				System.out.println("TAK");
			}
			else
			{
				System.out.println("NIE");
			}
			
		}
	}
	public static int readInt(BufferedReader br) throws IOException
	{
		//Wczytywaj znaki (spacje, entery i takie tam) az bedzie jakas cyfra (minus zmienia na ujemna)
		int znak;
		int wynik = 0;
		int znakLiczby = 1;
		do 
		{
			znak = br.read();
			if (znak == '-')
			{
				znakLiczby = -1;
				continue;
			}
		} while (znak < '0' || znak > '9');
		wynik = 0;
		//Wczytywaj cyfry i tworz inta, az napotkasz inny znak
		while ( (znak >= '0' && znak <= '9'))
		{
			wynik = wynik * 10 + znak - '0';
			znak = br.read();
		}
		return wynik * znakLiczby;
	}


}

