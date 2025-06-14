// Hi this is my solution by Tony Hano https://github.com/Tony-Hano

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String a = sc.nextLine();
        String[] arrs = a.split(" ");
        int[] arr1 = new int[arrs.length];
        int i = 0;
        for (String p : arrs) {
            arr1[i] = Integer.parseInt(p);
            i++;
        }
        Arrays.sort(arr1);
        int counter = 1;
        for (int j = 0; j < arr1.length; j++) {
            if (arr1[j] == arr1[j + 1]) {
                counter++;
            } else {
                break;
            }
        }
        Set<Integer> set = new HashSet<>();
        for (int o : arr1) {
            set.add(o);
        }
        int sum = 0;
        for (int k = 1; k < set.size(); k++) {
            sum += k;
        }
        sum = sum + counter + set.size() - 1;
        System.out.println(sum);
    }
}
