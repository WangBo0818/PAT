import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wb
 * @date 2019/12/28 - 15:14
 * 1014 福尔摩斯的约会
 */
public class Pat_1014 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String a1 = input.readLine();
        String a2 = input.readLine();
        String b1 = input.readLine();
        String b2 = input.readLine();
        int count = 0;
        char first = 0;
        char end = 0;
        int indexk = 0;
        for(int i = 0; i < a1.length(); i++) {
            if(count > 2) {
                break;
            }
            char c1 = a1.charAt(i);
            for(int j = 0; j < a2.length(); j++) {
                char c2 = a2.charAt(j);
                if(c1 == c2) {
                    if(c1 >= 'A' && c1 <= 'Z' && count == 0) {
                        first = c1;
                        indexk = j;
                        count++;
                        break;
                    }
                }
            }
            for(int k = indexk+1; k < a2.length(); k++) {
                char c3 = a2.charAt(k);
                char c4 = '0';
                if(k < a1.length()) {
                    c4 = a1.charAt(k);
                }
                if(c3 == c4 && ((c3 >= 0 && c3 <= 9) || (c3 <= 'Z' && c3 >='A'))) {
                    end = c3;
                    break;
                }
            }
        }
        int index = 0;
        int countb = 0;
        for(int i = 0; i < b1.length(); i++) {
            if(countb >= 1) {
                break;
            }
            char c1 = b1.charAt(i);
            for(int j = 0; j < b2.length(); j++) {
                char c2 = b2.charAt(j);
                if(c1 == c2 && ((c1 >= 'a' && c1 <= 'z') || c1 >= 'A' && c1 <= 'Z')) {
                    index = j;
                    countb++;
                    break;
                }
            }
        }
        Map<Character, String> map1 = new HashMap<>();
        map1.put('A', "MON");
        map1.put('B', "TUE");
        map1.put('C', "WED");
        map1.put('D', "THU");
        map1.put('E', "FRI");
        map1.put('F', "SAT");
        map1.put('G', "SUN");
        System.out.print(map1.get(first) + " ");

        Map<Character, Integer> map2 = new HashMap<>();
        map2.put('0', 0);
        map2.put('1', 1);
        map2.put('2', 2);
        map2.put('3', 3);
        map2.put('4', 4);
        map2.put('5', 5);
        map2.put('6', 6);
        map2.put('7', 7);
        map2.put('8', 8);
        map2.put('9', 9);
        map2.put('A', 10);
        map2.put('B', 11);
        map2.put('C', 12);
        map2.put('D', 13);
        map2.put('E', 14);
        map2.put('F', 15);
        map2.put('G', 16);
        map2.put('H', 17);
        map2.put('I', 18);
        map2.put('J', 19);
        map2.put('K', 20);
        map2.put('L', 21);
        map2.put('M', 22);
        map2.put('N', 23);
        System.out.printf("%02d",map2.get(end));
        System.out.print(":");
        System.out.printf("%02d",index);
    }
}
