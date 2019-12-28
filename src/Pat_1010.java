import java.util.Scanner;

/**
 * @author wb
 * @date 2019/12/28 - 15:12
 * 1010 一元多项式求导
 */
public class Pat_1010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean bool = false;
        while (sc.hasNext()) {
            int coef = sc.nextInt();
            int expon = sc.nextInt();
            if (coef * expon != 0) {
                if (bool) {
                    System.out.print(" ");
                } else {
                    bool = true;
                }
                System.out.print(coef * expon + " " + (expon - 1));
            }
        }
        sc.close();
        if (!bool) {
            System.out.print("0 0");
        }
    }
}
