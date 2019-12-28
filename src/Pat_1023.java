import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author wb
 * @date 2019/12/28 - 15:20
 * 1023 组个最小数
 */
public class Pat_1023 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        for(int i  = 0; i < 10; i++) {
            int num = scan.nextInt();
            for(int j = 0; j < num; j++) {
                list.add(i);
            }
        }
        scan.close();
        Collections.sort(list);
        int i = 0;
        while(list.get(i) == 0) {
            i += 1;
        }
        int temp = list.get(i);
        list.remove(i);
        list.add(i, 0);
        list.remove(0);
        list.add(0, temp);
        for(int j = 0; j < list.size(); j++) {
            System.out.print(list.get(j));
        }
    }
}
