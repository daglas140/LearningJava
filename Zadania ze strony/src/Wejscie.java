import java.util.Scanner;

public class Wejscie {

	public static void main(String[] args) {
		double zmiennaA;
		double zmiennaB;
		
		Scanner obiekt = new Scanner(System.in);
		zmiennaA = obiekt.nextDouble();
		zmiennaB = obiekt.nextDouble();
		
		System.out.println(zmiennaA + zmiennaB);
		System.out.println(zmiennaA - zmiennaB);
		System.out.println(zmiennaA * zmiennaB);
		System.out.println(zmiennaA / zmiennaB);
	}

}
