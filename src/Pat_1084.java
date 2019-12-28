import java.util.Scanner;

/**
 * @author wb
 * @date 2019/12/28 - 15:56
 * 1084 外观数列
 */
public class Pat_1084 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String d = scan.next();
        int n = scan.nextInt();
        scan.close();
        String str = d;
        for(int i = 2; i <= n; i++) {
            StringBuilder sb = new StringBuilder();
            char pre = str.charAt(0);
            int count = 1;
            for(int j = 1; j < str.length(); j++) {
                char c = str.charAt(j);
                if(c == pre) {
                    count++;
                }else {
                    sb.append(pre).append(count);
                    count = 1;
                    pre = c;
                }
            }
            sb.append(pre).append(count);
            str = sb.toString();
        }
        System.out.println(str);
    }
}
