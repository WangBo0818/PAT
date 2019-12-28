import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author wb
 * @date 2019/12/28 - 15:15
 * 1018 锤子剪刀布
 */
public class Pat_1018 {
    public static void main(String[] args) throws IOException {
        /*Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();*/
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
        int sheng = 0;
        int ping = 0;
        int fu = 0;
        List<Character> list1 = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            /*char jia = scan.next().charAt(0);
            char yi = scan.next().charAt(0);*/
            String[] arr = input.readLine().split(" ");
            char jia = arr[0].charAt(0);
            char yi = arr[1].charAt(0);
            if(jia == yi) {
                ping++;
            }else if((jia == 'B' && yi == 'C') || (jia == 'C' && yi == 'J') || (jia == 'J' && yi == 'B')) {
                sheng++;
                list1.add(jia);
            }else {
                fu++;
                list2.add(yi);
            }
        }
        // scan.close();
        //int yibai = sheng;
        //int yisheng = fu;
        System.out.println(sheng + " " + ping + " " + fu);
        System.out.println(fu + " " + ping + " " + sheng);
        System.out.print(count(list1) + " " + count(list2));
    }

    public static char count(List<Character> list) {
        int c = 0;
        int b = 0;
        int j = 0;
        for(int i = 0; i < list.size(); i++) {
            char tmp = list.get(i);
            if(tmp == 'B') {
                b++;
            }else if(tmp == 'C') {
                c++;
            }else {
                j++;
            }
        }
        return compare(b, c, j);
    }

    public static char compare(int b, int c, int j) {
        if(b >= c && b >= j) {
            return 'B';
        }else if(c >= j && c > b) {
            return 'C';
        }else if(j > b && j > c) {
            return 'J';
        }
        return '0';
    }
}
