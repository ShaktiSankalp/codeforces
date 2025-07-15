import java.io.*;
import java.util.*;

public class B {
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
        String s = sc.next();

        boolean found = false;

        
        for (int i = 1; i < n - 1; i++) {
            String a = s.substring(0, i);
            String b = s.substring(i, i + 1);
            String c = s.substring(i + 1);
            if ((a + c).contains(b)) {
                found = true;
                break;
            }
        }

        out.println(found ? "Yes" : "No");
    }

    
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
