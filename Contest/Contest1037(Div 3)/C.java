import java.io.*;
import java.util.*;

public class C {
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
        int[] pole = new int[n];
        int max = 0;
        for(int i = 0;i<n;i++){
            pole[i] = sc.nextInt();
            if(max<pole[i]){
                max = pole[i];
            }

           
        }
        int h = pole[k-1];
        if (Math.abs(max-h)<=h) {
            out.println("YES");
            
        }else{
            Arrays.sort(pole);
            int flag = 1;
            int j = 0;
            while(pole[j]!=h){
                j++;
            }
            for(int i = j;i<n-1;i++){
                if((pole[i+1]-pole[i] <= h)){
                    flag = 0;
                    
                }else{
                    flag = 1;
                    out.println("NO");
                    return;
                }
            }
            if(flag ==0){
                out.println("YES");
            }

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
