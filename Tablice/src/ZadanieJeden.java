import java.util.Scanner;

public class ZadanieJeden {

	public static void main(String[] args) {
		// Zadanie 1.12
		
		String imie;
		
		String tablicaImion[] = new String[5];
		
		for (int i = 0; i < 5 ; i++){
			Scanner odczyt = new Scanner(System.in);
			imie = odczyt.nextLine();
			tablicaImion[i] = imie;
		}
		for (int i = 0; i < 5 ; i++){
			System.out.println("Witaj " + tablicaImion[i]);
		}
	}
}
