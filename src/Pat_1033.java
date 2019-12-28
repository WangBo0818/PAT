import java.util.Scanner;

/**
 * @author wb
 * @date 2019/12/28 - 15:25
 * 1033 旧键盘打字
 */
public class Pat_1033 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String brokenStr = sc.next();
        String oldStr = sc.next();
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = 0; i < oldStr.length(); i++) {
            if (canShow(brokenStr, oldStr.charAt(i))) {
                char ch= oldStr.charAt(i);
                sb.append(ch);
                count++;
            }
        }
        if (count == 0){
            System.out.println();
        }
        else{
            System.out.print(sb.toString());
        }

    }

    public static boolean canShow(String brokenStr, char ch) {
        if (brokenStr.indexOf(Character.toUpperCase(ch)) >= 0 || brokenStr.indexOf(Character.toLowerCase(ch)) >= 0) {
            return false;
        }
        if (brokenStr.indexOf('+') >= 0 && ch - 'A' >= 0 && ch - 'A' <= 25) {
            return false;
        }
        return true;
    }
}
