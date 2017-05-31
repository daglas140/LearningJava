import java.io.File; 
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Imie {

	public static void main(String[] args) throws FileNotFoundException {
		//Zapis imiona
		PrintWriter zapis = new PrintWriter("imie.txt");
		zapis.println("Sebastian");
		zapis.close();
		//Odczyt imiona
		File plik = new File("imie.txt");
		Scanner odczytPlik = new Scanner(plik);
		System.out.println(odczytPlik.nextLine());
	}

}
