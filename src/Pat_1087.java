import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author wb
 * @date 2019/12/28 - 15:57
 * 1087 有多少不同的值
 */
public class Pat_1087 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        Set<Integer> set = new HashSet<>();
        for(int i = 1; i <= n; i++) {
            int num = i/2 + i/3 + i/5;
            set.add(num);
        }
        System.out.println(set.size());
    }
}
