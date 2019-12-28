import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author wb
 * @date 2019/12/28 - 15:34
 * 1050 螺旋矩阵
 */
public class Pat_1050 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(input.readLine());
        int[] arr = new int[N];
        String[] tmp = input.readLine().split(" ");
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(tmp[i]);
        }
        Arrays.sort(arr);
        int n = (int) Math.sqrt(N);
        while(0 != N % n) {
            --n;
        }
        int m = N / n;
        int[][] matrix = new int[m][n];
        // 方向，0右、1下、2左、3上
        int direction = 0;
        // 矩阵下标
        int k1 = 0, k2 = 0;
        for(int i = N-1; i >= 0; i--) {
            matrix[k1][k2] = arr[i];
            switch(direction) {
                case 0: {
                    // 右边未越界且未赋值
                    if(k2+1 < n && matrix[k1][k2+1] == 0) {
                        k2++;
                    }else {
                        // 向下移动,方向置为向下
                        k1++;
                        direction = 1;
                    }
                    break;
                }
                case 1: {
                    // 下边未越界且未赋值
                    if(k1+1 < m && matrix[k1+1][k2] == 0) {
                        k1++;
                    }else {
                        // 向左移动，方向置为向左
                        k2--;
                        direction = 2;
                    }
                    break;
                }
                case 2: {
                    // 左边未越界且未赋值
                    if(k2-1 >= 0 && matrix[k1][k2-1] == 0) {
                        k2--;
                    }else {
                        // 向上移动，方向置为向上
                        k1--;
                        direction = 3;
                    }
                    break;
                }
                default: {
                    // 上面未越界且未赋值
                    if(k1-1 >= 0 && matrix[k1-1][k2] == 0) {
                        k1--;
                    }else {
                        // 向右移动，方向置为向右
                        k2++;
                        direction = 0;
                    }
                }
            }
        }
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n-1; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(matrix[i][n - 1]);
        }
    }
}
