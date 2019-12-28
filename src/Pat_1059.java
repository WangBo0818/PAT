import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wb
 * @date 2019/12/28 - 15:35
 * 1059 C语言竞赛
 */
public class Pat_1059 {
    public static void main(String[] args) throws IOException {
        //Scanner scan = new Scanner(System.in);
        //int n = scan.nextInt();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            //list.add(scan.nextInt());
            list.add(Integer.parseInt(input.readLine()));
        }
        //int k = scan.nextInt();
        int k = Integer.parseInt(input.readLine());
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> query = new ArrayList<>();
        for(int i = 0; i < k; i++) {
            //int tmp = scan.nextInt();
            int tmp = Integer.parseInt(input.readLine());
            map.put(tmp, 1);
            //query.add(tmp);
            //int number = query.get(i);
            int number = tmp;
            System.out.printf("%04d",number);
            if(list.contains(number) && map.get(number) == 1) {
                if(number == list.get(0)) {
                    System.out.println(": Mystery Award");
                }else if(isPrimeNumber(number)) {
                    System.out.println(": Minion");
                }else {
                    System.out.println(": Chocolate");
                }
                map.put(number, map.get(number)-1);
            }else if(list.contains(number) && map.get(number) == 0){
                System.out.println(": Checked");
            }else {
                System.out.println(": Are you kidding?");
            }
        }
    }

    public static boolean isPrimeNumber(int num) {
        if(num <= 1) {
            return false;
        }
        if(num == 2 || num % 2 == 0) {
            return true;
        }
        for(int i = 3; i < Math.sqrt(num); i+=2) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
