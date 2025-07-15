// package Contest1027(Div 3);
import java.util.*;
public class NotQuiteaPalindromicStringB {

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            
            int c0 = 0;
            for (char ch : s.toCharArray()) {
                if (ch == '0') c0++;
            }
            int c1 = n - c0;
            int half = n / 2;
            
            boolean possible = false;
            
            // Try all possible number of good 00-pairs from 0 to k
            for (int good00 = 0; good00 <= k; good00++) {
                int good11 = k - good00;
                int badPairs = half - k;
                
                int need0 = 2 * good00 + badPairs;
                int need1 = 2 * good11 + badPairs;
                
                if (need0 <= c0 && need1 <= c1) {
                    possible = true;
                    break;
                }
            }
            
            System.out.println(possible ? "YES" : "NO");
        }
        sc.close();
    }
    
}
