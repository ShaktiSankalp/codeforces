// import java.util.*;

// public class SquareYearA {
    
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int q = sc.nextInt();
//         String[] arr = new String[q];
//         for(int i = 0;i<q;i++){
//             arr[i] = sc.next();

//         }
        
//         for(String s: arr){
//             int fl = 0;
//             int num = Integer.parseInt(s);

//         int sqrt = (int) Math.sqrt(num);

//          if (sqrt *sqrt != num) {
//                 System.out.println(-1);
//                 continue;
//             }

//         int left = 0;
//         int right = 0;
//         if(sqrt%2==0){
//             left = ((sqrt/2) -1);
//             right = left +2;

//         }else{
//             left = sqrt/2;
//             right = left +1;
//         }
        
            
//         while(left>=0 || right<=sqrt){
//             if(num==(left*left + right*right +(2*left*right))){
//                 System.out.println(left + " " + right);
//                 fl = 1;
//                 break;
//             }
//             left--;
//             right++;


//         }
//         if(fl==0){
//             System.out.println(-1);
//         }
        
//     }
//     sc.close();
        


//     }
// }




import java.util.*;

public class SquareYearA {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            int num = Integer.parseInt(s);
            int sqrt = (int)Math.sqrt(num);

            if(sqrt * sqrt != num){
                System.out.println(-1);
                continue;
            }

            
            boolean found = false;
            for(int a = 0; a <= sqrt; a++){
                int b = sqrt - a;
                
                System.out.println(a + " " + b);
                found = true;
                break;
            }

            if(!found){
                System.out.println(-1);
            }
        }
        sc.close();
    }
}
