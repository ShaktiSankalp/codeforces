
import java.util.*;
public class B {

    // static PrintWriter out = new PrintWriter(System.out);
    // static FastReader sc = new FastReader();

    // public static void main(String[] args) throws IOException {
    //     int t = sc.nextInt();  // number of test cases
    //     while (t-- > 0) {
    //         solve();
    //         out.flush(); 
    //     }
    //     //out.flush();  // flush output after all test cases
    // }

    // static void solve() {
    //     int n = sc.nextInt();
    //     int[] res = new int[n];
    //     int l = 1, r = n;
    //     for (int i = 0; i < n; i++) {
    //         if (i % 2 == 0) {
    //             res[i] = l++;
    //         } else {
    //             res[i] = r--;
    //         }
    //     }
    //     for (int i = 0; i < n; i++) {
    //         out.print(res[i]);
    //             if (i != n - 1) out.print(" ");
    //     }

    //     out.println();



        
            

    // }

    // // FastReader for faster input
    // static class FastReader {
    //     BufferedReader br;
    //     StringTokenizer st;

    //     public FastReader() {
    //         br = new BufferedReader(new InputStreamReader(System.in));
    //     }

    //     String next() {
    //         while (st == null || !st.hasMoreElements()) {
    //             try { st = new StringTokenizer(br.readLine()); }
    //             catch (IOException e) { e.printStackTrace(); }
    //         }
    //         return st.nextToken();
    //     }

    //     int nextInt() { return Integer.parseInt(next()); }
    //     long nextLong() { return Long.parseLong(next()); }
    //     double nextDouble() { return Double.parseDouble(next()); }
    //     String nextLine() {
    //         String str = "";
    //         try { str = br.readLine(); }
    //         catch (IOException e) { e.printStackTrace(); }
    //         return str;
    //     }
    // }












    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // Number of test cases
        while (t-- > 0) {
            int n = sc.nextInt();  // Size of permutation
            int[] res = new int[n];
            int low = 1;
            int high = n;

            // Create a zig-zag pattern: low, high, low, high,...
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    res[i] = low++;
                } else {
                    res[i] = high--;
                }
            }

            // Output the result
            for (int i = 0; i < n; i++) {
                System.out.print(res[i]);
                if (i < n - 1) System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }



    
}




// import java.util.Scanner;


// public class Main {
//     public static void main(String[] args) {
        
//         Scanner scanner = new Scanner(System.in);

        
//         int t = scanner.nextInt();

        
//         while (t-- > 0) {
            
//             int n = scanner.nextInt();

            
//             StringBuilder result = new StringBuilder();

            
//             result.append("2");

            
//             for (int i = 3; i <= n; i++) {
//                 result.append(" ").append(i);
//             }

            
//             result.append(" ").append("1");

            
//             System.out.println(result.toString());
//         }

        
//         scanner.close();
//     }
// }
