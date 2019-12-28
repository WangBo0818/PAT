import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @author wb
 * @date 2019/12/28 - 16:00
 * 1090 危险品装箱
 */
public class Pat_1090 {
    public static Map<String, List<String>> incompatibleItems;

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = input.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);
        incompatibleItems = new HashMap<String, List<String>>();
        for(int i = 0; i < n; i++) {
            String[] str = input.readLine().split(" ");
            addIncompatibleItems(str[0], str[1]);
            addIncompatibleItems(str[1], str[0]);
        }
        List<String> res = new ArrayList<>();
        for(int i = 0; i < m; i++) {
            res.add(input.readLine());
        }
        for(int i = 0; i < m; i++) {
            String[] tmp = res.get(i).split(" ");
            // 去掉数组的第一个元素
            tmp = Arrays.copyOfRange(tmp, 1, tmp.length);
            Arrays.sort(tmp);
            if(checkItems(tmp)) {
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }

    public static boolean checkItems(String[] itemList) {
        for(int i = 0; i < itemList.length; i++) {
            if(!incompatibleItems.containsKey(itemList[i])) {
                continue;
            }
            List<String> list = incompatibleItems.get(itemList[i]);
            for(int j = 0; j < list.size(); j++) {
                int index = Arrays.binarySearch(itemList, list.get(j));
                if(index >= 0) {
                    return false;
                }
            }
        }
        return true;
    }

    // 添加不相容物品列表
    public static void addIncompatibleItems(String item, String incompatibleItem) {
        List<String> list;
        if(incompatibleItems.containsKey(item)) {
            list = incompatibleItems.get(item);
        }else {
            list = new ArrayList<String>();
        }
        list.add(incompatibleItem);
        incompatibleItems.put(item, list);
    }
}
