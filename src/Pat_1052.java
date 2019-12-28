import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author wb
 * @date 2019/12/28 - 15:34
 * 1052 卖个萌
 */
public class Pat_1052 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String shou = input.readLine().replace(" ", "").replace("[", "").replace("]", "");
        String yan = input.readLine().replace(" ", "").replace("[", "").replace("]", "");
        String kou = input.readLine().replace(" ", "").replace("[", "").replace("]", "");
        int k = Integer.parseInt(input.readLine());
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i < k; i++) {
            String[] str = input.readLine().split(" ");
            List<Integer> tmp = new ArrayList<>(5);
            for(int j = 0; j < str.length; j++) {
                tmp.add(Integer.parseInt(str[j]));
            }
            list.add(tmp);
        }
        for(int i = 0; i < k; i++) {
            List<Integer> tmp = list.get(i);
            for(int j = 0; j < 5; j++) {
                if((j == 0 || j == 4) && tmp.get(j) > shou.length()) {
                    System.out.println("Are you kidding me? ");
                    continue;
                }
                if((j == 1 || j == 3) && tmp.get(j) > yan.length()) {
                    System.out.println("Are you kidding me? ");
                    continue;
                }
                if(j == 2 && tmp.get(j) > kou.length()) {
                    System.out.println("Are you kidding me? ");
                    continue;
                }
                if(j == 0) {
                    System.out.print(shou.charAt(tmp.get(j)));
                }
                if(j == 2) {
                    System.out.print(kou.charAt(tmp.get(j)));
                }
                if(j == 1) {
                    System.out.print("(" + yan.charAt(tmp.get(j)));
                }
                if(j == 3) {
                    System.out.print(")" + yan.charAt(tmp.get(j)));
                }
                if(j == 4) {
                    System.out.println(shou.charAt(tmp.get(j)));
                }
            }
        }
    }
}
