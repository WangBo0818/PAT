import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author wb
 * @date 2019/12/28 - 15:39
 * 1060 爱丁顿数
 */
public class Pat_1060 {
    public static void main(String[] args) throws IOException {
        //Scanner scan = new Scanner(System.in);
        //int n = scan.nextInt();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
        int[] nums = new int[n];
        /*for(int i = 0; i < n; i++) {
            nums[i] = scan.nextInt();
        }
        scan.close();*/
        String[] arr = input.readLine().split(" ");
        for(int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(nums);
        int[] result = new int[n];
        for(int i = n-1; i >= 0; i--) {
            result[n-1-i] = nums[i];
        }
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(result[i] > i+1 && count <= n) {
                count++;
            }
        }
        System.out.println(count);
    }
}
