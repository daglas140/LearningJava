import java.util.Scanner;

public class Imiona {

	public static void main(String[] args) {
		String imie; 
		Scanner odczyt = new Scanner(System.in);
		imie = odczyt.nextLine();
		
		if (imie.equals("Sebastian")){ // Podczas por�wnywania stringa u�ywamy equals() method
			System.out.println("Witaj Sebastianie");
		} 
		else {
		// equals lepiej u�ywa� na pewnych obiektach jak np. imie do kt�rego por�wnujemy ni� zmiennej
		if ("maciej".equals(imie.toLowerCase()) | "maciek".equals(imie.toLowerCase())){
				System.out.println("Witaj Macieju");
		}
		else if ("Bartosz".equalsIgnoreCase(imie)){
		System.out.println("Witaj Bartoszu");
		}
		else {
		System.out.println("Nie znam Ci�");
		}
		}
	}

}
