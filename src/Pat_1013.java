import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author wb
 * @date 2019/12/28 - 15:14
 * 1013 数素数
 */
public class Pat_1013 {
    private static boolean prime(int num) {
        int max = (int) Math.sqrt(num);
        for (int i = 2; i <= max; i++) {
            if (0 == num % i) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        /*Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        sc.close();*/
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = input.readLine().split(" ");
        int M = Integer.parseInt(arr[0]);
        int N = Integer.parseInt(arr[1]);

        int count = 1;
        int num = 2;
        while (count < M) {
            if (prime(num++)) {
                count++;
            }
        }

        int col = 0;
        while (count <= N) {
            if (prime(num)) {
                if (count == N || 9 == col) {
                    System.out.println(num);
                } else {
                    System.out.print(num + " ");
                }
                col = (col + 1) % 10;
                count++;
            }
            num++;
        }
    }
}
