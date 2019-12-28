import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author wb
 * @date 2019/12/28 - 15:40
 * 1065 单身狗
 */
public class Pat_1065 {
    static class Couple {
        String man;
        String women;
        Couple(String man, String women) {
            this.man = man;
            this.women = women;
        }
    }

    public static void main(String[] args) throws IOException {
        //Scanner scan = new Scanner(System.in);
        //int couple = scan.nextInt();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int couple = Integer.parseInt(input.readLine());
        List<Couple> list = new ArrayList<>();
        for(int i = 0; i < couple; i++) {
            String[] arr = input.readLine().split(" ");
            list.add(new Couple(arr[0], arr[1]));
        }
        //int n = scan.nextInt();
        int n = Integer.parseInt(input.readLine());
        List<String> nums = new ArrayList<>();
        /*for(int i = 0; i < n; i++) {
            nums.add(scan.next());
        }*/
        String[] tmp = input.readLine().split(" ");
        for(int i = 0; i < n; i++) {
            nums.add(tmp[i]);
        }
        //scan.close();
        for(int i = 0; i < list.size(); i++) {
            if(nums.contains(list.get(i).man) && nums.contains(list.get(i).women)) {
                nums.remove(nums.indexOf(list.get(i).man));
                nums.remove(nums.indexOf(list.get(i).women));
            }
        }
        Collections.sort(nums);
        System.out.println(nums.size());
        System.out.print(nums.get(0));
        for(int i = 1; i < nums.size(); i++) {
            System.out.print(" " + nums.get(i));
        }
    }
}
