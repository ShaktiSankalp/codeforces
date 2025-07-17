import java.io.*;
import java.util.*;

public class D {
    static PrintWriter out = new PrintWriter(System.out);
    static FastReader sc = new FastReader();

    static class Casino implements Comparable<Casino> {
        int l, r, real;

        Casino(int l, int r, int real) {
            this.l = l;
            this.r = r;
            this.real = real;
        }

        public int compareTo(Casino other) {
            return Integer.compare(this.l, other.l);
        }
    }

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

        Casino[] casinos = new Casino[n];
        for (int i = 0; i < n; i++) {
            casinos[i] = new Casino(sc.nextInt(), sc.nextInt(), sc.nextInt());
        }

        Arrays.sort(casinos); 
        PriorityQueue<Casino> available = new PriorityQueue<>((a, b) -> b.real - a.real);
        int maxCoins = k;

        int i = 0;
        while (true) {
            
            while (i < n && casinos[i].l <= k) {
                if (casinos[i].r >= k) {
                    available.add(casinos[i]);
                }
                i++;
            }

            if (available.isEmpty()) break;

            
            Casino best = available.poll();
            if (best.real <= k) continue; 
            k = best.real;
            maxCoins = Math.max(maxCoins, k);
        }

        out.println(maxCoins);
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
    }
}
