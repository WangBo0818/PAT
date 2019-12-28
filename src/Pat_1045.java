import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author wb
 * @date 2019/12/28 - 15:30
 * 1045 快速排序
 */
public class Pat_1045 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = scan.nextInt();
        }
        scan.close();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            boolean flag = true;
            for(int j = 0; j < i; j++) {
                if(arr[j] > arr[i]) {
                    flag = false;
                    break;
                }
            }
            for(int j = i+1; j > i && j < N; j++) {
                if(arr[i] > arr[j]) {
                    flag = false;
                    break;
                }
            }
            if(flag == true) {
                list.add(arr[i]);
            }
        }
        System.out.println(list.size());
        System.out.print(list.get(0));
        for(int i = 1; i < list.size(); i++) {
            System.out.print(" " + list.get(i));
        }
    }
}
