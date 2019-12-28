import java.util.Scanner;

/**
 * @author wb
 * @date 2019/12/28 - 16:01
 * 1094 谷歌的招聘
 */
public class Pat_1094 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int l = scan.nextInt();
        int k = scan.nextInt();
        String s = scan.next();
        scan.close();
        if(k > l) {
            System.out.println("404");
            return;
        }
        for(int i = 0; i < s.length(); i++) {
            if((i+k) <= s.length()) {
                String tmp = s.substring(i, i+k);
                if(isPrime(tmp) == true) {
                    System.out.println(tmp);
                    return ;
                }
            }
        }
        System.out.println("404");
    }

    public static boolean isPrime(String s) {
        int num = Integer.valueOf(s);
        double sqrt = Math.sqrt(num);
        if (num < 2) {
            return false;
        }
        if (num == 2 || num == 3) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        for (int i = 3; i < sqrt; i+=2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
