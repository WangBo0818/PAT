import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author wb
 * @date 2019/12/28 - 15:40
 * 1066 图像过滤
 */
public class Pat_1066 {
    public static void main(String[] args) throws IOException {
        /*Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        int color = scan.nextInt();*/
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String[] str = input.readLine().split(" ");
        int m = Integer.parseInt(str[0]);
        int n = Integer.parseInt(str[1]);
        int a = Integer.parseInt(str[2]);
        int b = Integer.parseInt(str[3]);
        int color = Integer.parseInt(str[4]);
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i < m; i++) {
            List<Integer> tmp = new ArrayList<>();
            /*for(int j = 0; j < n; j++) {
                tmp.add(scan.nextInt());
            }*/
            String[] arr = input.readLine().split(" ");
            for(int j = 0; j < n; j++) {
                tmp.add(Integer.parseInt(arr[j]));
            }
            list.add(tmp);
        }
        //scan.close();
        for(int i = 0; i < m; i++) {
            List<Integer> tmp = list.get(i);
            for(int j = 0; j < n; j++) {
                if(tmp.get(j) >= a && tmp.get(j) <= b) {
                    int indexOf = tmp.indexOf(tmp.get(j));
                    tmp.remove(indexOf);
                    tmp.add(indexOf, color);
                }
                if(j == 0) {
                    System.out.printf("%03d",tmp.get(j));
                }else {
                    System.out.printf(" ");
                    System.out.printf("%03d",tmp.get(j));
                }
            }
            System.out.println();
        }
    }
}
