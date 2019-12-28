import java.util.HashMap;
import java.util.Scanner;

/**
 * @author wb
 * @date 2019/12/28 - 15:19
 * 1021 个位数统计
 */
public class Pat_1021 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();
        String s = scan.nextLine();
        scan.close();
        String[] split = s.split("");
        for(int i = 0; i < split.length; i++) {
            String string = split[i];
            if(map.containsKey(string)) {
                int count = map.get(string);
                map.put(string, count + 1);
            }else {
                map.put(string, 1);
            }
        }
        for(int i = 0; i < map.size(); i++) {
            Object[] array = map.keySet().toArray();
            System.out.println(array[i] + ":" + map.get(array[i]));
        }
    }
}
