import java.util.*;

/**
 * @author wb
 * @date 2019/12/28 - 15:20
 * 1029 旧键盘
 */
public class Pat_1029 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String old = sc.next();
        String result = sc.next();
        Map<Character, Integer> mapResult = new HashMap<>();
        Map<Character, Integer> mapOld = new HashMap<>();

        char[] charsResult = result.toUpperCase().toCharArray();
        char[] charsOld = old.toUpperCase().toCharArray();

        for (int i = 0; i < charsResult.length; i++) {
            if (!mapResult.containsKey(charsResult[i])) {
                mapResult.put(charsResult[i], i);
            }
        }
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < charsOld.length; i++) {
            if (!mapResult.containsKey(charsOld[i])) {
                if (!mapOld.containsKey(charsOld[i])) {
                    mapOld.put(charsOld[i], i);
                    list.add(charsOld[i]);
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
    }
}
