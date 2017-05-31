
public class UkladWsp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punkt3D troj = new Punkt3D(1,1,1);
		Punkt2D dwa = new Punkt2D(5,5);
		Punkt2D jeden = new Punkt2D();
		
		System.out.println("Punkt posiada wspó³rzêdne: " + troj.wspX + ", " + troj.wspY + ", " + troj.wspZ);
		System.out.println("Punkt posiada wspó³rzêdne: " + dwa.wspX + ", " + dwa.wspY);
		System.out.println("Punkt posiada wspó³rzêdne: " + jeden.wspX + ", " + jeden.wspY);
	}

}
