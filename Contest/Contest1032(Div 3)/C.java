import java.io.*;

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
        int m = sc.nextInt();

        int[][] a = new int[n][m];
        int maxVal = 0;

        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
                if (a[i][j] > maxVal) maxVal = a[i][j];
            }
        }

        int[] rowCnt = new int[n];
        int[] colCnt = new int[m];
        int totMax = 0;

        
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                if (a[i][j] == maxVal) {
                    rowCnt[i]++;
                    colCnt[j]++;
                    totMax++;
                }

        
        int[] rows = new int[n];
        int nr = 0;
        for (int i = 0; i < n; i++) if (rowCnt[i] > 0) rows[nr++] = i;

        int[] cols = new int[m];
        int nc = 0;
        for (int j = 0; j < m; j++) if (colCnt[j] > 0) cols[nc++] = j;

        boolean canDrop = false;

        outer:
        for (int i = 0; i < nr; i++) {
            int r = rows[i];
            for (int j = 0; j < nc; j++) {
                int c = cols[j];
                int covered = rowCnt[r] + colCnt[c] - (a[r][c] == maxVal ? 1 : 0);
                if (covered == totMax) {   
                    canDrop = true;
                    break outer;
                }
            }
        }

        out.println(canDrop ? maxVal - 1 : maxVal);
    }

    
    static class FastReader {
        private final byte[] buffer = new byte[1 << 16];
        private int len, ptr;

        private int readByte() {
            if (ptr >= len) {
                try {
                    len = System.in.read(buffer);
                    ptr = 0;
                } catch (IOException e) {
                    return -1;
                }
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }

        String next() {
            StringBuilder sb = new StringBuilder();
            int c;
            while ((c = readByte()) <= ' ') if (c == -1) return "";
            do {
                sb.append((char) c);
                c = readByte();
            } while (c > ' ');
            return sb.toString();
        }

        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }
    }
}
