import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author wb
 * @date 2019/12/28 - 16:01
 * 1093 字符串A+B
 */
public class Pat_1093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        List<Character> list = new ArrayList<>();
        for(int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if(!list.contains(c)) {
                list.add(c);
            }
        }
        for(int i = 0; i < b.length(); i++) {
            char c = b.charAt(i);
            if(!list.contains(c)) {
                list.add(c);
            }
        }
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
    }
}
