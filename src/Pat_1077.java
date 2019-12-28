import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author wb
 * @date 2019/12/28 - 15:45
 * 1077 互评成绩计算
 */
public class Pat_1077 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        for (int i = 0; i < n; ++i) {
            String[] score = br.readLine().split(" ");
            double g2 = Double.parseDouble(score[0]);
            double sum = 0;
            double lowest = 50, higest = 0;
            int legalNum = 0;
            for (int j = 1; j < n; ++j) {
                double temp = Double.parseDouble(score[j]);
                if (temp >= 0 && temp <= m) {
                    sum += temp;
                    ++legalNum;
                    if (temp < lowest) {
                        lowest = temp;
                    }
                    if (temp > higest) {
                        higest = temp;
                    }
                }
            }
            double g1 = (sum - lowest - higest) / (legalNum - 2);
            System.out.printf("%.0f\n", (g1 + g2) / 2);
        }
    }
}
