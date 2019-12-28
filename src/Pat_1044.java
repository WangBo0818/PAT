import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wb
 * @date 2019/12/28 - 15:30
 * 1044 火星数字
 */
public class Pat_1044 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
        Map<String, Integer> map = new HashMap<>();
        map.put("tret", 0);
        map.put("jan", 1);
        map.put("feb", 2);
        map.put("mar", 3);
        map.put("apr", 4);
        map.put("may", 5);
        map.put("jun", 6);
        map.put("jly", 7);
        map.put("aug", 8);
        map.put("sep", 9);
        map.put("oct", 10);
        map.put("nov", 11);
        map.put("dec", 12);
        map.put("tam", 13);
        map.put("hel", 26);
        map.put("maa", 39);
        map.put("huh", 52);
        map.put("tou", 65);
        map.put("kes", 78);
        map.put("hei", 91);
        map.put("elo", 104);
        map.put("syy", 117);
        map.put("lok", 130);
        map.put("mer", 143);
        map.put("jou", 156);
        Map<Integer, String> tmp = new HashMap<>();
        tmp.put(0, "tret");
        tmp.put(1, "jan");
        tmp.put(2, "feb");
        tmp.put(3, "mar");
        tmp.put(4, "apr");
        tmp.put(5, "may");
        tmp.put(6, "jun");
        tmp.put(7, "jly");
        tmp.put(8, "aug");
        tmp.put(9, "sep");
        tmp.put(10, "oct");
        tmp.put(11, "nov");
        tmp.put(12, "dec");
        tmp.put(13, "tam");
        tmp.put(26, "hel");
        tmp.put(39, "maa");
        tmp.put(52, "huh");
        tmp.put(65, "tou");
        tmp.put(78, "kes");
        tmp.put(91, "hei");
        tmp.put(104, "elo");
        tmp.put(117, "syy");
        tmp.put(130, "lok");
        tmp.put(143, "mer");
        tmp.put(156, "jou");
        List<String> list = new ArrayList<>(n);
        for(int i = 0; i < n; i++) {
            list.add(input.readLine());
        }
        for(int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if(isLegel(s)) {
                // 是地球数字，转化为火星文
                int num = Integer.parseInt(s)/13;
                int yushu = Integer.parseInt(s)%13;
                if(num != 0 && yushu != 0) {
                    System.out.print(tmp.get(num*13));
                    System.out.println(" " + tmp.get(yushu));
                }else if(num == 0 && yushu != 0) {
                    System.out.println(tmp.get(yushu));
                }else if(num != 0 && yushu == 0) {
                    System.out.println(tmp.get(num*13));
                }else {
                    System.out.println("tret");
                }
            }else {
                // 火星文，转化为地球数字
                int sum = 0;
                String[] arr = s.split(" ");
                for(int j = 0; j < arr.length; j++) {
                    sum += map.get(arr[j]);
                }
                System.out.println(sum);
            }
        }
    }

    public static boolean isLegel(String s) {
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(!(c >= '0' && c <= '9')) {
                return false;
            }
        }
        return true;
    }
}
