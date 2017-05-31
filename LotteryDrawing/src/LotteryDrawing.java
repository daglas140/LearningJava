import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Daglas on 2017-05-31.
 */
public class LotteryDrawing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Ile liczb musisz wylosować?");
        int k = in.nextInt();

        System.out.println("Jaka jest największa liczba?");
        int n = in.nextInt();

        //Zapełnie talbicy
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = i + 1;
        }
        //Losowanie k liczb i zapamiętywanie ich w tablicy2
        int[] result = new int[k];
        for (int i = 0; i < result.length; i++){
            int r = (int)(Math.random() * n);
            result[i] = numbers[r];
            numbers[r] = numbers[n - 1];
            n--;
        }
        Arrays.sort(result);
        System.out.println("Postaw na liczby a wygrasz totka: ");
        for(int r : result){
            System.out.println(r);
        }
     }
}
