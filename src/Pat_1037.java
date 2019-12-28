import java.util.Scanner;

/**
 * @author wb
 * @date 2019/12/28 - 15:25
 * 1037 在霍格沃茨找零钱
 */
public class Pat_1037 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.next();
        String s2 = scan.next();
        scan.close();
        String[] split1 = s1.split("\\.");
        String[] split2 = s2.split("\\.");
        int num = transfer(split2) - transfer(split1);
        int of1 = num / (17 * 29);
        int yushu = num % (17 * 29);
        int of2 = yushu / 29;
        yushu = yushu % 29;
        if(num > 0) {
            System.out.println(of1 + "." + of2 + "." + yushu);
        }else if(num == 0){
            System.out.println(0 + "." + 0 + "." + 0);
        }else {
            System.out.println(of1 + "." + (-of2) + "." + (-yushu));
        }
    }

    public static int transfer(String[] split) {
        int of1 = Integer.valueOf(split[0]);
        int of2 = Integer.valueOf(split[1]);
        int of3 = Integer.valueOf(split[2]);
        int result = of1 * 17 * 29 + of2 * 29 + of3;
        return result;
    }
}
