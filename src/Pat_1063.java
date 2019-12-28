import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author wb
 * @date 2019/12/28 - 15:40
 * 1063 计算谱半径
 */
public class Pat_1063 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
        //List<Double> list = new ArrayList<>(n);
        Double[] list = new Double[n];
        for(int i = 0; i < n; i++) {
            String[] str = input.readLine().split(" ");
            int tmp = Integer.parseInt(str[0]) * Integer.parseInt(str[0]) + Integer.parseInt(str[1])* Integer.parseInt(str[1]);
            double num = Math.sqrt(tmp);
            //list.add(num);
            list[i] = num;
        }
        //Collections.sort(list);
        Arrays.sort(list);
        //System.out.printf("%.2f", list.get(list.size()-1));
        System.out.printf("%.2f", list[list.length-1]);
    }
}
