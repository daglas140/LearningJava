import java.util.Scanner;

public class ZadanieDwa {

	public static void main(String[] args) {
		// Zadanie 1.13
		//Utwórz tablicê typu int przechowuj¹c¹ n elementów - gdzie
		//n jest parametrem pobieranym od u¿ytkownika. 
		//Nastêpnie wype³nij j¹ liczbami od 1 do n i wyœwietl
		//zawartoœæ na ekranie przy pomocy pêtli while.
		Scanner odczyt = new Scanner(System.in);
		int liczba = odczyt.nextInt();
		int i=0;
		while (i < liczba)
		{
			int tablica[] = new int[liczba];
			tablica[i] = i + 1;
			System.out.println(tablica[i]);
			i++;
		}
		/*for (int i = 0; i < liczba ; i++){
			int tablica[] = new int[liczba];
			tablica[i] = i + 1;
			System.out.println(tablica[i]);
		}*/
	}
}
