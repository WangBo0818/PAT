import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wb
 * @date 2019/12/28 - 15:25
 * 1038 统计同成绩学生
 */
public class Pat_1038 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
        Map<Integer, Integer> map = new HashMap<>();
        String[] tmp = input.readLine().split(" ");
        for(int i = 0; i < n; i++) {
            int key = Integer.parseInt(tmp[i]);
            if(!map.containsKey(key)) {
                map.put(key, 1);
            }else {
                map.put(key, map.get(key)+1);
            }
        }
        String[] str = input.readLine().split(" ");
        int m = Integer.parseInt(str[0]);
        int[] res = new int[m];
        for(int i = 0; i < m; i++) {
            res[i] = Integer.parseInt(str[i+1]);
        }
        if(map.get(res[0]) == null) {
            System.out.print("0");
        }else {
            System.out.print(map.get(res[0]));
        }
        for(int i = 1; i < m; i++) {
            if(map.get(res[i]) == null) {
                System.out.print(" " + "0");
            }else {
                System.out.print(" " + map.get(res[i]));
            }
        }
    }
}
