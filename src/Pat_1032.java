import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wb
 * @date 2019/12/28 - 15:25
 * 1032 挖掘机技术哪家强
 */
public class Pat_1032 {
    public static void main(String[] args) throws IOException {
        // Scanner scan = new Scanner(System.in);
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer,Integer> map = new HashMap<>();
        // int N = scan.nextInt();
        int N = Integer.parseInt(input.readLine());
        int max = 0;
        for(int i = 0; i < N; i++) {
            // int sid = scan.nextInt();
            // int score = scan.nextInt();
            String[] arr = input.readLine().split(" ");
            int sid = Integer.parseInt(arr[0]);
            int score = Integer.parseInt(arr[1]);
            if(!map.containsKey(sid)) {
                map.put(sid,score);
            }else {
                map.put(sid,map.get(sid) + score);
            }
        }
        Object[] array = map.keySet().toArray();
        for(int i = 0; i < array.length; i++) {
            int num = map.get(array[i]);
            if(num > max) {
                max = num;
            }
        }
        for(int i = 0; i < array.length; i++) {
            if(map.get(array[i]) == max) {
                System.out.print(array[i] + " " + max);
            }
        }
        // scan.close();
    }
}
