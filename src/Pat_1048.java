import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author wb
 * @date 2019/12/28 - 15:30
 * 1048 数字加密
 */
public class Pat_1048 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String[] str = input.readLine().split(" ");
        String a = str[0];
        String b = str[1];
        int Alength = a.length()-1;
        int Blength = b.length()-1;
        int count = 1;
        String res = "";
        while(Alength > 0 && Blength > 0) {
            int numA = a.charAt(Alength) - '0';
            int numB = b.charAt(Blength) - '0';
            int tmp = 0;
            if(count % 2 == 0) {
                tmp = numB - numA;
                if(tmp < 0) {
                    tmp += 10;
                }
            }else {
                tmp = (numA + numB) % 13;
            }
            if(tmp == 10) {
                res += "J";
            }else if(tmp == 11) {
                res += "Q";
            }else if(tmp == 12) {
                res += "K";
            }else {
                res += tmp;
            }
            Alength--;
            Blength--;
            count++;
        }
        while(Alength >= 0) {
            res += "0";
            Alength--;
        }
        while(Blength >= 0) {
            res += b.charAt(Blength);
            Blength--;
        }
        // 将res反转
        String realRes = "";
        for(int i = res.length()-1; i >= 0; i--) {
            realRes += res.charAt(i);
        }
        System.out.println(realRes);
    }
}
