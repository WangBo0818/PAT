import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wb
 * @date 2019/12/28 - 15:20
 * 1028 人口普查
 */
public class Pat_1028 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
        String[] name = new String[n];
        String[] birthday = new String[n];
        Map<Double, String> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            String[] str = input.readLine().split(" ");
            name[i] = str[0];
            birthday[i] = str[1].replace("/", "");
            map.put(Double.parseDouble(birthday[i]), name[i]);
        }
        int count = 0;
        double max = 0;
        double min = Double.MAX_VALUE;
        for(int i = 0; i < n; i++) {
            if(Double.parseDouble(birthday[i]) < 18140906 || Double.parseDouble(birthday[i]) > 20140906) {
                continue;
            }else {
                count++;
                if(Double.parseDouble(birthday[i]) > max) {
                    max = Double.parseDouble(birthday[i]);
                }
                if(Double.parseDouble(birthday[i]) < min) {
                    min = Double.parseDouble(birthday[i]);
                }
            }
        }
        System.out.println(count + " " + map.get(min) + " " + map.get(max));
    }
}
