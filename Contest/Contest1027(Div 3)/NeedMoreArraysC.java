
import java.util.*;
public class NeedMoreArraysC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int ans = 0;
            int lastChosen = Integer.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                if (a[i] > lastChosen + 1) {
                    ans++;
                    lastChosen = a[i];
                }
            }

            System.out.println(ans);
        }

        sc.close();
    }
    
}


