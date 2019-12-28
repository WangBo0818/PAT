import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wb
 * @date 2019/12/28 - 15:24
 * 1031 查验身份证
 */
public class Pat_1031 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
        List<String> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String s = input.readLine();
            list.add(s);
        }
        List<String> res = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            if(isAllNumber(list.get(i)) == false || isLegel(list.get(i)) == false) {
                res.add(list.get(i));
            }
        }
        if(res.size() == 0) {
            System.out.println("All passed");
        }else {
            for(int i = 0; i < res.size(); i++) {
                System.out.println(res.get(i));
            }
        }
    }

    // 判断校验码是否正确
    public static boolean isLegel(String s) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 7);
        map.put(1, 9);
        map.put(2, 10);
        map.put(3, 5);
        map.put(4, 8);
        map.put(5, 4);
        map.put(6, 2);
        map.put(7, 1);
        map.put(8, 6);
        map.put(9, 3);
        map.put(10, 7);
        map.put(11, 9);
        map.put(12, 10);
        map.put(13, 5);
        map.put(14, 8);
        map.put(15, 4);
        map.put(16, 2);
        double sum = 0;
        for(int i = s.length()-2; i >= 0; i--) {
            double c = s.charAt(i) - '0';
            sum += ((double)c*(double)map.get(c)/100);
        }
        Map<Integer, Character> tmp = new HashMap<>();
        tmp.put(0, '1');
        tmp.put(1, '0');
        tmp.put(2, 'X');
        tmp.put(3, '9');
        tmp.put(4, '8');
        tmp.put(5, '7');
        tmp.put(6, '6');
        tmp.put(7, '5');
        tmp.put(8, '4');
        tmp.put(9, '3');
        tmp.put(10, '2');
        char c = s.charAt(s.length()-1);
        if(map.get(sum) == c) {
            return true;
        }else {
            return false;
        }
    }

    // 判断前17位是否全部都为数字
    public static boolean isAllNumber(String s) {
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(!(c >= 0 && c <= 9)) {
                return false;
            }
        }
        return true;
    }
}
