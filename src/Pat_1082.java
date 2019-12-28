import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * @author wb
 * @date 2019/12/28 - 15:56
 * 1082 射击比赛
 */
public class Pat_1082 {
    static class Player {
        int id;
        int x;
        int y;
        Player(int id, int x, int y) {
            this.id = id;
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) throws IOException {
        //Scanner scan = new Scanner(System.in);
        //int n = scan.nextInt();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
        List<Player> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String[] str = input.readLine().split(" ");
            list.add(new Player(Integer.parseInt(str[0]), Integer.parseInt(str[1]), Integer.parseInt(str[2])));
        }
        //scan.close();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i = 0; i < n; i++) {
            int score = list.get(i).x * list.get(i).x + list.get(i).y * list.get(i).y;
            map.put(score, list.get(i).id);
        }
        Object[] array = map.keySet().toArray();
        System.out.printf("%04d", map.get(array[0]));
        System.out.printf(" ");
        System.out.printf("%04d", map.get(array[array.length-1]));
    }
}
