import java.io.*;
import java.util.*;

public class D {
    static PrintWriter out = new PrintWriter(System.out);
    static FastReader sc = new FastReader();

    public static void main(String[] args) throws IOException {
        int t = sc.nextInt();  
        while (t-- > 0) {
            solve();
        }
        out.flush();  
        out.close(); 
    }

    static void solve() {
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        ArrayList<int[]> operations = new ArrayList<>();

        boolean changed;
        
        do {
            changed = false;

            
            for (int i = 0; i < n; i++) {
                if (a[i] > b[i]) {
                    int temp = a[i];
                    a[i] = b[i];
                    b[i] = temp;
                    operations.add(new int[]{3, i + 1});
                    changed = true; 
                }
            }

            
            for (int i = 0; i < n - 1; i++) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    operations.add(new int[]{1, i + 1});
                    changed = true; 
                }
            }

            
            for (int i = 0; i < n - 1; i++) {
                if (b[i] > b[i + 1]) {
                    int temp = b[i];
                    b[i] = b[i + 1];
                    b[i + 1] = temp;
                    operations.add(new int[]{2, i + 1});
                    changed = true; 
                }
            }

        } while (changed); 
        
        out.println(operations.size());
        
        for (int[] op : operations) {
            out.println(op[0] + " " + op[1]);
        }
    }

    
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}