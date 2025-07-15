import java.io.*;
import java.util.*;

public class Line {
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
        int k = sc.nextInt();
        
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;

        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
            int distance;
            if(i==0){
                distance = arr[i];
            }else{
                distance = arr[i]-arr[i-1];
                
            }
            
            max = Math.max(max, distance);
            



            
            


        }
        max = Math.max(max,2*(k-arr[n-1]));
        out.println(max);

        
        
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

