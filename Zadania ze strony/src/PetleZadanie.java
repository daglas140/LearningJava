import java.util.Scanner;

public class PetleZadanie {

	public static void main(String[] args) {
		//Zadanie 1.11
		
		int zmienna = 0;
		Scanner odczyt = new Scanner(System.in);
		zmienna = odczyt.nextInt();
		int zmiennaDwa = zmienna;
		for (int x = 0; zmienna != 0; zmienna--){
			System.out.println("Bomba wybuchnie za: " + zmienna);
		}
		
		while(zmiennaDwa != 0){
			System.out.println("Bomba wybuchnie za: " + zmiennaDwa);
			zmiennaDwa--;
		}
	}

}
