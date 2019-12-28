import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author wb
 * @date 2019/12/28 - 15:15
 * 1017 A除以B
 */
public class Pat_1017 {
    public static void main(String[] args) throws IOException {
        /*Scanner scan = new Scanner(System.in);
        String a = scan.next();
        int b = scan.nextInt();
        scan.close();*/
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = input.readLine().split(" ");
        String a = arr[0];
        int b = Integer.parseInt(arr[1]);
        int yushu = 0;
        if(a.length() == 1) {
            int num = Integer.parseInt(a);
            System.out.print(num/b + " " + num%b);
            return;
        }
        for(int i = 0; i < a.length(); i++) {
            yushu = yushu +  (a.charAt(i) - '0');
            if(yushu >= b) {
                System.out.print(yushu / b);
            }else {
                if(i != 0) {
                    System.out.print(0);
                }
            }
            yushu = (yushu % b) * 10;
        }
        System.out.print(" " + yushu / 10);
    }
}
