import java.io.*;
import java.util.*;

public class Cover {
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
        String str = sc.next();
        int ans=0;
        int finalAns=0;

        for(int i = 0;i<n;i++){
            
            
            if(str.charAt(i)=='#'){
                finalAns=0;
            }else{
                ans++;
                finalAns++;
                if(finalAns>2){
                    
                    break;
                }
                
            }
            
        }
        if(finalAns>2){
            out.println(2);

        }else{
            out.println(ans);
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

