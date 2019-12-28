import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

/**
 * @author wb
 * @date 2019/12/28 - 15:56
 * 1083 是否存在相等的差
 */
public class Pat_1083 {
    public static void main(String[] args) throws IOException {
        //Scanner scan = new Scanner(System.in);
        //int n = scan.nextInt();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
        int[] arr = new int[n];
        /*for(int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }*/
        String[] str = input.readLine().split(" ");
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i = 0; i < n; i++) {
            int num = Math.abs(i+1-arr[i]);
            if(!map.containsKey(num)) {
                map.put(num, 1);
            }else {
                map.put(num, map.get(num)+1);
            }
        }
        Object[] array = map.keySet().toArray();
        for(int i = array.length-1; i >= 0 ; i--) {
            if(map.get(array[i]) <= 1) {
                map.remove(array[i]);
            }else {
                System.out.println(array[i] + " " + map.get(array[i]));
            }
        }
    }
}
