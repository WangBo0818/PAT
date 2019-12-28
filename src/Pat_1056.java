import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author wb
 * @date 2019/12/28 - 15:35
 * 1056 组合数的和
 */
public class Pat_1056 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = scan.nextInt();
        }
        scan.close();
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i != j) {
                    int num = nums[i]*10 + nums[j];
                    set.add(num);
                }
            }
        }
        int sum = 0;
        for (Integer num : set) {
            sum += num;
        }
        System.out.println(sum);
    }
}
