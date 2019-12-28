import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wb
 * @date 2019/12/28 - 15:25
 * 1039 到底买不买
 */
public class Pat_1039 {
    public static void main(String[] args) throws IOException {
        //Scanner scan = new Scanner(System.in);
        //String s1 = scan.nextLine();
        //String s2 = scan.nextLine();
        //scan.close();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String s1 = input.readLine();
        String s2 = input.readLine();
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if(!map.containsKey(c)) {
                map.put(c, 1);
            }else {
                map.put(c, map.get(c) + 1);
            }
        }
        int count = 0;
        for(int j = 0; j < s2.length(); j++) {
            char c = s2.charAt(j);
            if(map.containsKey(c)) {
                if(map.get(c) > 0) {
                    map.put(c, map.get(c)-1);
                }else {
                    count++;
                }
            }else {
                count++;
            }
        }
        if(count > 0) {
            System.out.println("No" + " " + count);
        }else {
            System.out.println("Yes" + " " + (s1.length() - s2.length()));
        }
    }
}
