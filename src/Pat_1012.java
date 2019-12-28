import java.util.Scanner;

/**
 * @author wb
 * @date 2019/12/28 - 15:14
 * 1012 数字分类
 */
public class Pat_1012 {
    private static void output(int x, int count) {
        if (count > 0) {
            System.out.print(x + " ");
        } else {
            System.out.print("N" + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] x = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
        }
        sc.close();

        int A1, A2, A3, A5;
        double A4;
        A1 = A2 = A3 = A5 = 0;
        A4 = 0;

        int a1Count, a2Count, a4Count, a5Count;
        a1Count = a2Count = a4Count = a5Count = 0;

        for (int i = 0; i < N; i++) {
            switch (x[i] % 5) {
                case 0:
                    if (0 == (x[i] & 1)) {
                        A1 += x[i];
                        a1Count++;
                    }
                    break;
                case 1:
                    if (0 == (a2Count & 1)) {
                        A2 += x[i];
                    } else {
                        A2 -= x[i];
                    }
                    a2Count++;
                    break;
                case 2:
                    A3++;
                    break;
                case 3:
                    A4 += x[i];
                    a4Count++;
                    break;
                case 4:
                    if (A5 < x[i]) {
                        A5 = x[i];
                        a5Count++;
                    }
                    break;
                default:
            }
        }

        output(A1, a1Count);
        output(A2, a2Count);
        output(A3, A3);

        if (a4Count > 0) {
            System.out.printf("%.1f ", A4 / a4Count);
        } else {
            System.out.print("N" + " ");
        }

        if (a5Count > 0) {
            System.out.println(A5);
        } else {
            System.out.println("N");
        }
    }
}
