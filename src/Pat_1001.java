import java.util.Scanner;

/**
 * @author wb
 * @date 2019/12/28 - 15:06
 * 1001 害死人不偿命的(3n+1)猜想
 */
public class Pat_1001 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        int n = scan.nextInt();
        scan.close();
        if(n == 1) {
            System.out.println(count);
            return ;
        }
        while(n != 1) {
            if(n %2 == 0) {
                n = n/2;
            }else {
                n = (3*n+1)/2;
            }
            count++;
        }
        System.out.println(count);
    }
}
