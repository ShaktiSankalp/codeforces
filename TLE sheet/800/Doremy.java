
import java.io.*;
import java.util.*;

public class Doremy {
    static PrintWriter out = new PrintWriter(System.out);
    static FastReader sc = new FastReader();

    public static void main(String[] args) throws IOException {
        int t = sc.nextInt();  
        while (t-- > 0) {
            solve();
        }
        out.flush();  
    }

    static void solve() {
       int n = sc.nextInt();
      int sum = 0;
       for(int i = 0;i<n;i++){
        int temp = sc.nextInt();
        sum = sum + temp;


       }
       if(sum%n-1==0){
        out.println("YES");
       }else{
        out.println("NO");
       }
        
        
    }

    // FastReader for faster input
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try { st = new StringTokenizer(br.readLine()); }
                catch (IOException e) { e.printStackTrace(); }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }
        String nextLine() {
            String str = "";
            try { str = br.readLine(); }
            catch (IOException e) { e.printStackTrace(); }
            return str;
        }
    }
}
