import java.util.Scanner;

public class Imiona {

	public static void main(String[] args) {
		String imie; 
		Scanner odczyt = new Scanner(System.in);
		imie = odczyt.nextLine();
		
		if (imie.equals("Sebastian")){ // Podczas porównywania stringa u¿ywamy equals() method
			System.out.println("Witaj Sebastianie");
		} 
		else {
		// equals lepiej u¿ywaæ na pewnych obiektach jak np. imie do którego porównujemy ni¿ zmiennej
		if ("maciej".equals(imie.toLowerCase()) | "maciek".equals(imie.toLowerCase())){
				System.out.println("Witaj Macieju");
		}
		else if ("Bartosz".equalsIgnoreCase(imie)){
		System.out.println("Witaj Bartoszu");
		}
		else {
		System.out.println("Nie znam Ciê");
		}
		}
	}

}
