
public class TablicaWielo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] tablicaWielo = new int[2][3];
		tablicaWielo[0][0] = 0;
		tablicaWielo[0][1] = 1;
		tablicaWielo[0][2] = 2;
		tablicaWielo[1][0] = 3;
		tablicaWielo[1][1] = 4;
		tablicaWielo[1][2] = 5;
		
		for (int i = 0; i < tablicaWielo.length; i++){
			for (int j = 0; j < tablicaWielo[i].length; j++){
				System.out.print(tablicaWielo[i][j]);
			}
			System.out.println();
		}
	}

}
