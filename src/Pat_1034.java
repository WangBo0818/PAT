import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author wb
 * @date 2019/12/28 - 15:25
 * 1034 有理数四则运算
 */
public class Pat_1034 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = input.readLine().split(" ");
        String[] tmp = arr[0].split("/");
        int afenzi = Integer.parseInt(tmp[0]);
        int afenmu = Integer.parseInt(tmp[1]);
        String[] tmp1 = arr[1].split("/");
        int bfenzi = Integer.parseInt(tmp1[0]);
        int bfenmu = Integer.parseInt(tmp1[1]);

    }

    // 将大于1的最简分数格式化
    public static String convert(int fz, int fm) {
        if(fz == 0) {
            return "0";
        }
        if(fm == 0) {
            return "Inf";
        }
        StringBuilder result = new StringBuilder();

        return result.toString();
    }

    // 求最小公因数
    public static int gcd(int a, int b) {
        while(a % b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return b;
    }
}
