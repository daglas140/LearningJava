import java.util.Scanner;
/*
 * Przyk�adowy program do zczytywania znak�w z konsoli.
 */
public class HelloWorld {

	public static void main(String[] args) {
		String imie;
		Scanner odczyt = new Scanner(System.in);
		imie = odczyt.nextLine();
		
		System.out.println("System wita " + imie);
		System.out.println("Do widzenia");
	}

}
