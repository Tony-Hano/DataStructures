// Hi it is me Tony Hano https://github.com/Tony-Hano
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            arr1[i] = x;
        }

        for (int l = 0; l < arr1.length - 1; l++) {
            int counter = 0;
            for (int j = l + 1; j < arr1.length; j++) {
                if (arr1[l] > arr1[j]) {
                    counter++;
                }
            }
            System.out.println(counter);
        }
        System.out.println("0");

    }
}
