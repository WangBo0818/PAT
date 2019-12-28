import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author wb
 * @date 2019/12/28 - 15:10
 * 1007 素数对猜想
 */
public class Pat_1007 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        scan.close();
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= number; i++) {
            if(isPrime(i) == true) {
                list.add(i);
            }
        }
        int count = 0;
        for(int i = 0; i < list.size()-1; i++) {
            if(list.get(i+1) - list.get(i) == 2) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean isPrime(int number) {
        if(number < 2) {
            return false;
        }
        int n = (int)Math.sqrt(number);
        for(int i = 2; i <= n; i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
