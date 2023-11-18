
import java.util.*;

public class KFreqNumber {

    public static void N_mostFreqNum(int[] arr, int N, int K) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < N; i++) {
            if (mp.containsKey(arr[i])) {
                mp.put(arr[i], mp.get(arr[i]) + 1);
            } else {
                mp.put(arr[i], 1);
            }
        }
        int[] a = new int[mp.size()];
        int j = 0;
        for (int i : mp.keySet()) {
            a[j] = i;
            j++;
        }
        Arrays.sort(a);
        Arrays.sort(a, new Comparator<Integer>() {
            public int compare(Integer x, Integer y) {
                return mp.get(y) - mp.get(x);
            }
        });
        System.out.println(K + " numbers with most occurrences are:");
        for (int i = 0; i < K; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {7, 10, 11, 5, 2, 5, 5, 7, 11, 8, 9};
        int N = 11;
        int K = 4;
        N_mostFreqNum(arr, N, K);
    }
}
