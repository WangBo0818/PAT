import java.util.Scanner;

/**
 * @author wb
 * @date 2019/12/28 - 15:20
 * 1027 打印沙漏
 */
public class Pat_1027 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String str = sc.next();
        double temp = Math.pow((N+1)*1.0/2,0.5);
        int n = (int) temp;

        for (int i = n; i > 1; i--) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for(int k = 0; k < 2*i-1; k++){
                System.out.print(str);
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for(int k = 0; k < 2*i-1; k++){
                System.out.print(str);
            }
            System.out.println();
        }
        int sum = N-(2*n*n-1);
        System.out.println(sum);
    }
}
