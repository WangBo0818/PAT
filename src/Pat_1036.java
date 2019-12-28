import java.util.Scanner;

/**
 * @author wb
 * @date 2019/12/28 - 15:25
 * 1036 跟奥巴马一起编程
 */
public class Pat_1036 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        char c = scan.next().charAt(0);
        scan.close();
        for(int i = 0; i < N; i++) {
            System.out.print(c);
        }
        System.out.println();
        for(int i = 0; i < (Math.round((double)N / 2) - 2); i++) {
            System.out.print(c);
            for(int j = 0; j < N - 2; j++) {
                System.out.print(" ");
            }
            System.out.print(c);
            System.out.println();
        }
        for(int i = 0; i < N; i++) {
            System.out.print(c);
        }
    }
}
