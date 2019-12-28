import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author wb
 * @date 2019/12/28 - 15:07
 * 1002 写出这个数
 */
public class Pat_1002 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        char[] arr = s.toCharArray();
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "ling");
        map.put(1, "yi");
        map.put(2, "er");
        map.put(3, "san");
        map.put(4, "si");
        map.put(5, "wu");
        map.put(6, "liu");
        map.put(7, "qi");
        map.put(8, "ba");
        map.put(9, "jiu");
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += (arr[i]-'0');
        }
        String str = "";
        str += sum;
        char[] array = str.toCharArray();
        for(int i = 0; i < array.length; i++) {
            if(map.containsKey(array[i]-'0')) {
                if(i != array.length-1) {
                    System.out.print(map.get(array[i]-'0') + " ");
                }else {
                    System.out.print(map.get(array[i]-'0'));
                }
            }
        }
    }
}
