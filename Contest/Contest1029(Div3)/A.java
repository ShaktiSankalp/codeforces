import java.io.*;
import java.util.*;

public class A {

    


    static PrintWriter out = new PrintWriter(System.out);
    static FastReader sc = new FastReader();

    public static void main(String[] args) throws IOException {
        int t = sc.nextInt();  // number of test cases
        while (t-- > 0) {
            solve();
        }
        out.flush();  // flush output after all test cases
    }

    static void solve() {
        // Your solution here
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

        // // Example output
        // out.println(Arrays.toString(arr));

        int n = sc.nextInt();  // number of doors
            int x = sc.nextInt();  // button duration
            int[] doors = new int[n];

            for (int i = 0; i < n; i++) {
                doors[i] = sc.nextInt();
            }
            int pos = doors.length-1;

            if(x>=n){
                out.println("YES");
            }else{
                for(int i = 0;i<doors.length;i++){
                    if(doors[i]==1){
                        pos=i;
                        break;

                    }
                }
                

                if(pos+(x-1)>=doors.length-1){
                    out.println("YES");
                }else{
                    int flag = 0;
                    for(int i = pos+(x);i<doors.length;i++){
                        if(doors[i]==1){
                            flag = 1;
                            break;
                        }

                     }
                     if(flag==0){
                        out.println("YES");
                     }else{
                        out.println("NO");
                     }
                   
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
