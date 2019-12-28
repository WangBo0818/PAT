import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

/**
 * @author wb
 * @date 2019/12/28 - 15:20
 * 1024 科学计数法
 */
public class Pat_1024 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String s = input.readLine();
        BigDecimal res = new BigDecimal(s);
        System.out.println(res.toPlainString());
    }
}
