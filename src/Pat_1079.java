import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author wb
 * @date 2019/12/28 - 15:45
 * 1079 延迟的回文数
 */
public class Pat_1079 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String number = input.readLine();
        int i = 1;
        while(i <= 10) {
            if(isPalindromic(number)) {
                System.out.println(number + " is a palindromic number.");
                return;
            }else {
                System.out.println(number + " + " + reverse(number) + " = " + getStringSum(number, reverse(number)));
                i++;
                number = getStringSum(number, reverse(number));
            }
        }
        System.out.println("Not found in 10 iterations.");
    }

    // 获取两个字符串的和
    public static String getStringSum(String a, String b) {
        int lengthA = a.length()-1;
        int lengthB = b.length()-1;
        int jinwei = 0;
        String result = "";
        while(lengthA >= 0 && lengthB >= 0) {
            int benwei = (a.charAt(lengthA) - '0' + b.charAt(lengthB) - '0' + jinwei) % 10;
            jinwei = (a.charAt(lengthA) - '0' + b.charAt(lengthB) - '0' + jinwei) / 10;
            result += benwei;
            lengthA--;
            lengthB--;
        }
        if(a.length() == b.length() && jinwei != 0) {
            result += jinwei;
        }
        return reverse(result);
    }

    // 将字符串反转
    public static String reverse(String number) {
        String res = "";
        for(int i = number.length()-1; i >= 0; i--) {
            res += number.charAt(i);
        }
        return res;
    }

    public static boolean isPalindromic(String s) {
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != s.charAt(s.length()-1-i)) {
                return false;
            }
        }
        return true;
    }
}
