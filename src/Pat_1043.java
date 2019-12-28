import java.util.Scanner;

/**
 * @author wb
 * @date 2019/12/28 - 15:30
 * 1043 输出PATest
 */
public class Pat_1043 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        scan.close();
        char[] arr = str.toCharArray();
        int P = 0;
        int A = 0;
        int T = 0;
        int e = 0;
        int s = 0;
        int t = 0;
        for(int i = 0; i < arr.length; i++) {
            char c = arr[i];
            switch(c) {
                case 'P' : {
                    P++;
                    break;
                }
                case 'A' : {
                    A++;
                    break;
                }
                case 'T' : {
                    T++;
                    break;
                }
                case 'e' : {
                    e++;
                    break;
                }
                case 's' : {
                    s++;
                    break;
                }
                case 't' : {
                    t++;
                    break;
                }
            }
        }
        while(P > 0 || A > 0 || T > 0 || e > 0 || s > 0 || t > 0) {
            if(P > 0) {
                System.out.print("P");
                P--;
            }
            if(A > 0) {
                System.out.print("A");
                A--;
            }
            if(T > 0) {
                System.out.print("T");
                T--;
            }
            if(e > 0) {
                System.out.print("e");
                e--;
            }
            if(s > 0) {
                System.out.print("s");
                s--;
            }
            if(t > 0) {
                System.out.print("t");
                t--;
            }
        }
    }
}
