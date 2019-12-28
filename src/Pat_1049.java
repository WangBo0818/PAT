import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author wb
 * @date 2019/12/28 - 15:30
 * 1049 数列的片段和
 */
public class Pat_1049 {
    public static void main(String[] args) throws IOException {
        //Scanner scan = new Scanner(System.in);
        //int n = scan.nextInt();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
        double sum = 0;
	    /*for(int i = 0; i < n; i++) {
	        double num = scan.nextDouble();
	        sum = sum + num * (n-i) * (i+1);
	    }*/
        String[] arr = input.readLine().split(" ");
        for(int i = 0; i < n; i++) {
            double num = Float.valueOf(arr[i]);
            sum = sum + num * (n-i) * (i+1);
        }
        //scan.close();
        System.out.printf("%.2f",sum);
    }
}
