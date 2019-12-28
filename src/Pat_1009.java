import java.util.Scanner;

/**
 * @author wb
 * @date 2019/12/28 - 15:12
 * 1009 说反话
 */
public class Pat_1009 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        if(s == null || s.length() == 0) {
            System.out.print("");
        }
        scan.close();
        String[] str = s.split(" ");
        for(int i = str.length-1; i >= 0; i--) {
            if(i != 0) {
                System.out.print(str[i] + " ");
            }else {
                System.out.print(str[i]);
            }
        }
    }
}
