import java.util.Scanner;

/**
 * @author wb
 * @date 2019/12/28 - 15:57
 * 1088 三人行
 */
public class Pat_1088 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double m = scan.nextDouble();
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        scan.close();
        int yi = 0;
        double bing = 0.0;
        for(int i = 99; i >= 10; i--) {
            yi = (i%10)*10 + i/10;
            bing = Math.abs(i-yi)/x;
            if(bing*y == yi) {
                System.out.print(i);
                System.out.print(" ");
                print(i, m);
                System.out.print(" ");
                print(yi, m);
                System.out.print(" ");
                print(bing, m);
                return;
            }
        }
        System.out.print("No Solution");
    }

    public static void print(double num, double m) {
        if(num > m) {
            System.out.print("Cong");
        }else if(num < m) {
            System.out.print("Gai");
        }else{
            System.out.print("Ping");
        }
    }
}
