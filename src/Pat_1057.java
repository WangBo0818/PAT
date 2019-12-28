import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wb
 * @date 2019/12/28 - 15:35
 * 1057 数零壹
 */
public class Pat_1057 {
    public static void main(String[] args) throws IOException {
        //Scanner scan = new Scanner(System.in);
        //String s = scan.nextLine();
        //scan.close();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String s = input.readLine();
        Map<Character, Integer> map = new HashMap<>();
        map.put('a', 1);
        map.put('b', 2);
        map.put('c', 3);
        map.put('d', 4);
        map.put('e', 5);
        map.put('f', 6);
        map.put('g', 7);
        map.put('h', 8);
        map.put('i', 9);
        map.put('j', 10);
        map.put('k', 11);
        map.put('l', 12);
        map.put('m', 13);
        map.put('n', 14);
        map.put('o', 15);
        map.put('p', 16);
        map.put('q', 17);
        map.put('r', 18);
        map.put('s', 19);
        map.put('t', 20);
        map.put('u', 21);
        map.put('v', 22);
        map.put('w', 23);
        map.put('x', 24);
        map.put('y', 25);
        map.put('z', 26);
        s = s.toLowerCase();
        char[] arr = s.trim().toCharArray();
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])) {
                sum += map.get(arr[i]);
            }
        }
        String str = "";
        int count0 = 0;
        int count1 = 0;
        while(sum != 0) {
            int yushu = sum % 2;
            str += yushu;
            sum = sum / 2;
        }
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '0') {
                count0++;
            }else {
                count1++;
            }
        }
        System.out.println(count0 + " " + count1);
    }
}
