import java.util.*;

/**
 * @author wb
 * @date 2019/12/28 - 15:09
 * 1005 继续(3n+1)猜想
 */
public class Pat_1005 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int num = scan.nextInt();
            list.add(num);
            while(num != 1) {
                if(num % 2 == 0) {
                    num /= 2;
                }else {
                    num = (3*num+1)/2;
                }
                set.add(num);
            }
        }
        scan.close();
        for(int i = 0; i < list.size(); i++) {
            if(!set.contains(list.get(i))) {
                l.add(list.get(i));
            }
        }
        Collections.sort(l, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1 > o2) {
                    return -1;
                }else if(o1 < o2) {
                    return 1;
                }else {
                    return 0;
                }
            }
        });
        for(int i = 0; i < l.size(); i++) {
            if(i != l.size()-1) {
                System.out.print(l.get(i) + " ");
            }else {
                System.out.print(l.get(i));
            }
        }
    }
}
