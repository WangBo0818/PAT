import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * @author wb
 * @date 2019/12/28 - 15:30
 * 1047 编程团体赛
 */
public class Pat_1047 {
    static class Teamer {
        String number;
        int score;
        Teamer(String number, int score) {
            this.number = number;
            this.score = score;
        }
    }

    public static void main(String[] args) throws IOException {
        //Scanner scan = new Scanner(System.in);
        //int n = scan.nextInt();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            String[] s = input.readLine().split(" ");
            Teamer teamer = new Teamer(s[0], Integer.parseInt(s[1]));
            String number = teamer.number;
            String[] str = number.split("-");
            if(!map.containsKey(str[0])) {
                map.put(str[0],teamer.score);
            }else {
                map.put(str[0],teamer.score + map.get(str[0]));
            }
        }
        //scan.close();
        String key = "0";
        map.put(key, 0);
        Object[] array = map.keySet().toArray();
        for (Object object : array) {
            if(map.get(object) > map.get(key)) {
                key = (String)object;
            }
        }
        System.out.print(key + " " + map.get(key));
    }
}
