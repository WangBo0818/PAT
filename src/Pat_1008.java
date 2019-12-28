import java.util.Scanner;

/**
 * @author wb
 * @date 2019/12/28 - 15:11
 * 1008 数组元素循环右移问题
 */
public class Pat_1008 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = scan.nextInt();
        }
        scan.close();
        M = M % N;
        for(int i = N-M; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
        for(int i = 0; i < N - M; i++) {
            if(i == N - M - 1) {
                System.out.print(arr[i]);
            }else {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
