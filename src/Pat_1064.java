import java.util.*;

/**
 * @author wb
 * @date 2019/12/28 - 15:40
 * 1064 朋友数
 */
public class Pat_1064 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String num = scan.next();
            list.add(getNum(num));
        }
        scan.close();
        Collections.sort(list);
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < list.size(); i++) {
            set.add(list.get(i));
        }
        System.out.println(set.size());
        Iterator<Integer> iterator = set.iterator();
        int count = 1;
        while(iterator.hasNext()) {
            if(count == 1) {
                System.out.print(iterator.next());
            }
            System.out.print(" " + iterator.next());
            count++;
        }
    }

    public static int getNum(String num) {
        int sum = 0;
        for(int i = 0; i < num.length(); i++) {
            int number = num.charAt(i)-'0';
            sum += number;
        }
        return sum;
    }
}
