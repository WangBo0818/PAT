import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author wb
 * @date 2019/12/28 - 15:34
 * 1053 住房空置率
 */
public class Pat_1053 {
    public static void main(String[] args) throws IOException {
        /*Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        float e = scan.nextFloat();
        int d = scan.nextInt();*/
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = input.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        float e = Float.valueOf(arr[1]);
        int d = Integer.parseInt(arr[2]);
        int mayEmpty = 0;
        int empty = 0;
        for(int i = 0; i < n; i++) {
            // int k = scan.nextInt();
            String[] str = input.readLine().split(" ");
            int k = Integer.parseInt(str[0]);
            float[] nums = new float[k];
            /*for(int j = 0; j < k; j++) {
                nums[j] = scan.nextFloat();
            }*/
            for(int j = 0; j <k; j++) {
                nums[j] = Float.valueOf(str[j+1]);
            }
            int countE = 0;
            for(int j = 0; j < nums.length; j++) {
                if(nums[j] < e) {
                    countE++;
                }
            }
            if(countE > (k/2)) {
                if(k <= d) {
                    mayEmpty++;
                }
                if(k > d) {
                    empty++;
                }
            }
        }
        //scan.close();
        System.out.printf("%.1f%% %.1f%%", mayEmpty * 100.0 / n, empty * 100.0 / n);
    }
}
