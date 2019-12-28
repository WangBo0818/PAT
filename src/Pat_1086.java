import java.util.Scanner;

/**
 * @author wb
 * @date 2019/12/28 - 15:57
 * 1086 就不告诉你
 */
public class Pat_1086 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();
        int num = a*b;
        String s = String.valueOf(num);
        String str = "";
        for(int i = s.length()-1; i >= 0; i--) {
            char c = s.charAt(i);
            str += c;
        }
        System.out.println(Integer.valueOf(str));
    }
}
