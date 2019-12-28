import java.util.*;

/**
 * @author wb
 * @date 2019/12/28 - 15:40
 * 1061 判断题
 */
public class Pat_1061 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < m; i++) {
            map.put(i, scan.nextInt());
        }
        Map<Integer, Integer> rightMap = new HashMap<>();
        for(int i = 0; i < m; i++) {
            rightMap.put(i, scan.nextInt());
        }
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        for(int i = 0; i < n; i++) {
            List<Integer> temp = new ArrayList<>();
            for(int j = 0; j < m; j++) {
                temp.add(scan.nextInt());
            }
            list.add(temp);
        }
        scan.close();
        for (List<Integer> l : list) {
            int socre = 0;
            for(int i = 0; i < l.size(); i++) {
                if(l.get(i) == rightMap.get(i)) {
                    socre += map.get(i);
                }
            }
            System.out.println(socre);
        }
    }
}
