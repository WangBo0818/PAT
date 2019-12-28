import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author wb
 * @date 2019/12/28 - 16:00
 * 1092 最好吃的月饼
 */
public class Pat_1092 {
    public static void main(String[] args) throws IOException {
        /*Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();*/
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String[] str = input.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        List<List<Integer>> list = new ArrayList<>();
        int[] arr = new int[n];
        for(int i = 0; i < m; i++) {
            List<Integer> tmp = new ArrayList<>();
            /*for(int j = 0; j < n; j++) {
                int num = scan.nextInt();
                tmp.add(num);
                arr[j] += num;
            }*/
            String[] arrs = input.readLine().split(" ");
            for(int j = 0; j < n; j++) {
                int num = Integer.parseInt(arrs[j]);
                tmp.add(num);
                arr[j] += num;
            }
            list.add(tmp);
        }
        //scan.close();
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            res.add(arr[i]);
        }
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);
        int count = 1;
        for(int i = 0; i < res.size(); i++) {
            if(res.get(i) == arr[arr.length-1]) {
                if(count == 1) {
                    System.out.print(i+1);
                }else {
                    System.out.print(" " + (i+1));
                }
                count++;
            }
        }
    }
}
