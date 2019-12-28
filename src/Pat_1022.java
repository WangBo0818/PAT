import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author wb
 * @date 2019/12/28 - 15:20
 * 1022 D进制的A+B
 */
public class Pat_1022 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int d = scan.nextInt();
        scan.close();
        int c = a + b;
        List<Integer> list = new ArrayList<>();
        if(c == 0) {
            System.out.print(0);
            return;
        }
        while(c != 0) {
            int yushu = c % d;
            c = c / d;
            list.add(yushu);
        }
        for(int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i));
        }
    }
}
