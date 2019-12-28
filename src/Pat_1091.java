import java.util.Scanner;

/**
 * @author wb
 * @date 2019/12/28 - 16:00
 * 1091 N-自守数
 */
public class Pat_1091 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        scan.close();
        for(int i = 0; i < arr.length; i++) {
            int num = judge(arr[i]);
            if(num == 0) {
                System.out.println("No");
            }else {
                System.out.println(num + " " + num * arr[i] * arr[i]);
            }
        }
    }

    public static int judge(int num) {
        for (int i = 1; i < 10; i++)
            if ((num*num*i) % (Math.pow(10, String.valueOf(num).length())) == num)
                return i;
        return 0;
    }
}
