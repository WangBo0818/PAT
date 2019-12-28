import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author wb
 * @date 2019/12/28 - 15:34
 * 1051 复数乘法
 */
public class Pat_1051 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String[] str = input.readLine().split(" ");
        double r1 = Double.parseDouble(str[0]);
        double p1 = Double.parseDouble(str[1]);
        double r2 = Double.parseDouble(str[2]);
        double p2 = Double.parseDouble(str[3]);

        double a = r1 * Math.cos(p1) * r2 * Math.cos(p2) - r1 * Math.sin(p1) * r2 * Math.sin(p2);
        double b = r1 * Math.sin(p1) * r2 * Math.cos(p2) + r2 * Math.sin(p2) * r1 * Math.cos(p1);
        if (Math.abs(a) <= 0.001) {
            System.out.print("0.00");
        } else {
            System.out.printf("%.2f", a);
        }

        if (b > 0) {
            System.out.printf("+%.2fi", b);
        } else if (Math.abs(b) <= 0.001) {
            System.out.print("+0.00i");
        } else {
            System.out.printf("%.2fi", b);
        }
    }
}
