import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author wb
 * @date 2019/12/28 - 15:45
 */
public class Pat_1074 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String n = input.readLine();
        String a = input.readLine();
        String b = input.readLine();
        int lengthN = n.length()-1;
        int lengthA = a.length()-1;
        int lengthB = b.length()-1;
        int jinwei = 0;
        int count = 0;
        String result = "";
        while(lengthA >= 0 && lengthB >= 0) {
            if(n.length() > 0 && n.length() <= 20) {
                int ca = a.charAt(lengthA) - '0';
                int cb = b.charAt(lengthB) - '0';
                int cn = n.charAt(lengthN) - '0';
                //int benwei = (ca+cb+jinwei) % cn;
                //jinwei = (ca+cb+jinwei) / cn;
                int benwei = 0;
                if(cn != 0) {
                    benwei = (ca+cb+jinwei) % cn;
                }else {
                    benwei = (ca+cb+jinwei) % 10;
                }
                if(cn != 0) {
                    jinwei = (ca+cb+jinwei) / cn;
                }else {
                    jinwei = (ca+cb+jinwei) / 10;
                }
                count++;
                lengthA--;
                lengthB--;
                lengthN--;
                result += benwei;
            }else {
                int ca = a.charAt(lengthA) - '0';
                int cb = b.charAt(lengthB) - '0';
                int cn = n.charAt(lengthN) - '0';
                int benwei = 0;
                benwei = (ca+cb+jinwei) % 10;
                jinwei = (ca+cb+jinwei) / 10;
                count++;
                lengthA--;
                lengthB--;
                lengthN--;
                result += benwei;
            }
        }
        // 此时a或 b可能还有剩余的位数没处理，将其处理
        while(count < a.length()-1) {
            if(count < 20) {
                int ca = a.charAt(lengthA) - '0';
                int cn = n.charAt(lengthN) - '0';
                int benwei = 0;
                if(cn != 0) {
                    benwei = (ca+jinwei) % cn;
                }else {
                    benwei = ca+jinwei % 10;
                }
                if(cn != 0) {
                    jinwei = (ca+jinwei) / cn;
                }else {
                    jinwei = (ca+jinwei) / 10;
                }
                count++;
                result += benwei;
            }else {
                int ca = a.charAt(lengthA) - '0';
                int cn = n.charAt(lengthN) - '0';
                int benwei = 0;
                if(cn != 0) {
                    benwei = (ca+jinwei) % 10;
                }else {
                    benwei = ca+jinwei % 10;
                }
                if(cn != 0) {
                    jinwei = (ca+jinwei) / 10;
                }else {
                    jinwei = (ca+jinwei) / 10;
                }
                count++;
                result += benwei;
            }
        }
        while(count < b.length()-1) {
            if(count < 20) {
                int cb = b.charAt(lengthB) - '0';
                int cn = n.charAt(lengthN) - '0';
                int benwei = 0;
                if(cn != 0) {
                    benwei = (cb+jinwei) % cn;
                }else {
                    benwei = cb+jinwei % 10;
                }
                if(cn != 0) {
                    jinwei = (cb+jinwei) / cn;
                }else {
                    jinwei = (cb+jinwei) / 10;
                }
                count++;
                result += benwei;
            }else {
                int cb = b.charAt(lengthB) - '0';
                int cn = n.charAt(lengthN) - '0';
                int benwei = 0;
                if(cn != 0) {
                    benwei = (cb+jinwei) % 10;
                }else {
                    benwei = cb+jinwei % 10;
                }
                if(cn != 0) {
                    jinwei = (cb+jinwei) / 10;
                }else {
                    jinwei = (cb+jinwei) / 10;
                }
                count++;
                result += benwei;
            }
        }
        // 将result逆置
        String realRes = "";
        for(int i = result.length()-1; i >= 0; i--) {
            realRes += result.charAt(i);
        }
        System.out.println(realRes);
    }
}
