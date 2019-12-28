import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author wb
 * @date 2019/12/28 - 15:45
 * 1076 Wifi密码
 */
public class Pat_1076 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
        for(int i = 0; i < n; i++) {
            String s = input.readLine();
            String[] split = s.split(" ");
            for(int j = 0; j < split.length; j++) {
                if(split[j].equals("A-T")) {
                    System.out.print(1);
                }else if(split[j].equals("B-T")) {
                    System.out.print(2);
                }else if(split[j].equals("C-T")) {
                    System.out.print(3);
                }else if(split[j].equals("D-T")) {
                    System.out.print(4);
                }
            }
        }
        input.close();
    }
}
