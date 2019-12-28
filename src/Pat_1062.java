import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author wb
 * @date 2019/12/28 - 15:40
 * 1062 最简分数
 */
public class Pat_1062 {
    public static void main(String[] args) throws IOException {
        /*Scanner scan = new Scanner(System.in);
        String s1 = scan.next();
        String s2 = scan.next();
        int k = scan.nextInt();
        scan.close();*/
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = input.readLine().split(" ");
        String s1 = arr[0];
        String s2 = arr[1];
        int k = Integer.parseInt(arr[2]);

        String[] str1 = s1.split("/");
        String[] str2 = s2.split("/");
        int n1 = Integer.parseInt(str1[0]);
        int m1 = Integer.parseInt(str1[1]);
        int n2 = Integer.parseInt(str2[0]);
        int m2 = Integer.parseInt(str2[1]);
        // 定义 m1, m2, k 三者之间的公倍数（无需是最小公倍数）
        int num = m1*m2*k;
        n1 = n1*m2*k;
        n2 = n2*m1*k;
        List<Integer> list = new ArrayList<>();
        if(n1 < n2) {
            for(int i = n1; i < n2; i++) {
                //int gongyinshu = maxCommonDivisor(i, num);
                if(num / maxCommonDivisor(i, num) == k) {
                    list.add(i/maxCommonDivisor(i, num));
                }
            }
        }else {
            for(int i = n2; i < n1; i++) {
                //int gongyinshu = maxCommonDivisor(i, num);
                if(num / maxCommonDivisor(i, num) == k) {
                    list.add(i/maxCommonDivisor(i, num));
                }
            }
        }
        Collections.sort(list);
        System.out.print(list.get(0) + "/" + k);
        for(int i = 1; i < list.size(); i++) {
            System.out.print(" " + list.get(i) + "/" + k);
        }
    }

    // 求最大公因数
    public static int maxCommonDivisor(int m, int n) {
        if(m < n) {
            int temp = m;
            m = n;
            n = temp;
        }
        while(m % n != 0) {
            int temp = m % n;
            m = n;
            n = temp;
        }
        return n;
    }

}
