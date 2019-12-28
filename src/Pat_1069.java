import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author wb
 * @date 2019/12/28 - 15:41
 * 1069 微博转发抽奖
 */
public class Pat_1069 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = input.readLine().split(" ");
        int m = Integer.parseInt(arr[0]);
        int n = Integer.parseInt(arr[1]);
        int s = Integer.parseInt(arr[2]);
        String[] str = new String[m];
        for(int i = 0; i < m; i++) {
            str[i] = input.readLine();
        }
        List<String> list = new ArrayList<>();
        // 第一个中奖者
        if(s > m) {
            System.out.println("Keep going...");
            return ;
        }
        for(int i = s-1; i < m; i += n) {
            while(list.contains(str[i])) {
                i++;
            }
            if(!list.contains(str[i])) {
                list.add(str[i]);
            }
        }
        if(list.size() == 0) {
            System.out.println("Keep going...");
            return ;
        }
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
