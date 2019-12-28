import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author wb
 * @date 2019/12/28 - 15:13
 * 1011 A+B 和 C
 */
public class Pat_1011 {
    static class Number {
        double a;
        double b;
        double c;
        Number(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        List<Number> list = new ArrayList<>();
        for(int i = 0; i < t; i++) {
            list.add(new Number(scan.nextDouble(), scan.nextDouble(), scan.nextDouble()));
        }
        scan.close();
        for(int i = 0; i < list.size(); i++) {
            if((list.get(i).a + list.get(i).b) > list.get(i).c) {
                System.out.println("Case #" + (i+1) + ": true");
            }else {
                System.out.println("Case #" + (i+1) + ": false");
            }
        }
    }
}
