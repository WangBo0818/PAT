import java.util.Scanner;

/**
 * @author wb
 * @date 2019/12/28 - 15:10
 */
public class Pat_1006 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();
        int num1 = num / 100;
        int yushu1 = num % 100;
        int num2 = yushu1 / 10;
        int yushu2 = yushu1 % 10;
        for(int i = 0; i < num1; i++) {
            System.out.print("B");
        }
        for(int i = 0; i < num2; i++) {
            System.out.print("S");
        }
        for(int i = 1; i <= yushu2; i++) {
            System.out.print(i);
        }
    }
}
