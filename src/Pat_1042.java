import java.util.Scanner;
import java.util.TreeMap;

/**
 * @author wb
 * @date 2019/12/28 - 15:30
 * 1042 字符统计
 *
 */
public class Pat_1042 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        TreeMap<Character, Integer> map = new TreeMap<>();
        String lowerCase = s.toLowerCase();
        for(int i = 0; i < lowerCase.length(); i++) {
            char c = lowerCase.charAt(i);
            if(c >= 'a' && c <= 'z') {
                if(!map.containsKey(c)) {
                    map.put(c, 1);
                }else {
                    map.put(c, map.get(c)+1);
                }
            }
        }
        Object[] array = map.keySet().toArray();
        char result = 0;
        int max = 0;
        for(int i = array.length-1; i >= 0; i--) {
            if(map.get(array[i]) >= max) {
                max = map.get(array[i]);
                result = (char) array[i];
            }
        }
        System.out.println(result + " " + max);
    }
}
