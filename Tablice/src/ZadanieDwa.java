import java.util.Scanner;

public class ZadanieDwa {

	public static void main(String[] args) {
		// Zadanie 1.13
		//Utw�rz tablic� typu int przechowuj�c� n element�w - gdzie
		//n jest parametrem pobieranym od u�ytkownika. 
		//Nast�pnie wype�nij j� liczbami od 1 do n i wy�wietl
		//zawarto�� na ekranie przy pomocy p�tli while.
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
