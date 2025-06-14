
//Here is my solution by Tony Hano https://github.com/Tony-Hano
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String a = sc.nextLine();

        String[] arrs = s.split(" ");
        int[] arr1 = new int[arrs.length];
        int i = 0;
        for (String p : arrs) {
            arr1[i] = Integer.parseInt(p);
            i++;
        }
        int n = arr1[0];
        int m = arr1[1];

        String[] arrs2 = a.split(" ");
        int[] arr2 = new int[arrs2.length];
        int j = 0;
        for (String p : arrs2) {
            arr2[j] = Integer.parseInt(p);
            j++;
        }
        int max = 0;
        int z = 0;
        StringBuilder sb = new StringBuilder();
        for (int v = 0; v < n - m + 1; v++) {
            z = v;
            for (int c = 0; c < m; c++) {
                int[] x = new int[m];
                x[c] = arr2[z];
                if (x[c] > max) {
                    max = x[c];
                }
                z++;
            }
            sb.append(max + " ");
        }
        System.out.println(sb);
    }
}

