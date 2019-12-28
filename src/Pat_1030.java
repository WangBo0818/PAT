import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author wb
 * @date 2019/12/28 - 15:24
 * 1030 完美数列
 */
public class Pat_1030 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = input.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        double p = Double.parseDouble(arr[1]);
        String[] str = input.readLine().split(" ");
        double[] array = new double[n];
        for(int i = 0; i < n; i++) {
            array[i] = Double.parseDouble(str[i]);
        }
        Arrays.sort(array);
        double max = array[array.length-1];
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(array[i]*p >= max) {
                break;
            }else {
                count++;
            }
        }
        System.out.println(n-count);
    }
}
