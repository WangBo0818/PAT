import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author wb
 * @date 2019/12/28 - 15:44
 * 1070 结绳
 */
public class Pat_1070 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
        int[] arr = new int[n];
        String[] str = input.readLine().split(" ");
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        Arrays.sort(arr);
        int sum = (arr[0] + arr[1])/2;
        for(int i = 2; i < n; i++) {
            sum = (sum + arr[i])/2;
        }
        System.out.println(sum);
    }
}
