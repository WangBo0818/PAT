import java.util.Arrays;
import java.util.Scanner;

/**
 * @author wb
 * @date 2019/12/28 - 15:15
 * 1019 数字黑洞
 */
public class Pat_1019 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.close();
        while (true) {
            int d = desc(N);
            int i = insc(N);
            N = i - d;
            if (N == 0) {
                System.out.printf("%04d - %04d = %04d\n", i, d, N);
                break;
            }
            if (N == 6174) {
                System.out.printf("%04d - %04d = %04d\n", i, d, N);
                break;
            }
            System.out.printf("%04d - %04d = %04d\n", i, d, N);
        }
    }

    public static int desc(int number) {
        char[] charArray = String.format("%04d", number).toCharArray();
        Arrays.sort(charArray);
        int temp = 0;
        for(int i = 0; i < charArray.length; i++) {
            temp = temp * 10 + (charArray[i]-'0');
        }
        return temp;
    }

    public static int insc(int number) {
        char[] charArray = String.format("%04d", number).toCharArray();
        Arrays.sort(charArray);
        int temp = 0;
        for(int i = 3; i >=0; i--) {
            temp = temp * 10 + (charArray[i]-'0');
        }
        return temp;
    }
}
