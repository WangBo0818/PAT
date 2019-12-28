import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author wb
 * @date 2019/12/28 - 15:40
 * 1068 万绿丛中一点红
 */
public class Pat_1068 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int tol = scan.nextInt();
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            List<Integer> tmp = new ArrayList<>();
            for(int j = 0; j < m; j++) {
                tmp.add(scan.nextInt());
            }
            list.add(tmp);
        }
        scan.close();
        int count = 0;
        int x = 0;
        int y = 0;
        int number = 0;
        for(int i = 1; i < n-1; i++) {
            List<Integer> pre = list.get(i-1);
            List<Integer> tmp = list.get(i);
            List<Integer> after = list.get(i+1);
            for(int j = 1; j < m-1; j++) {
                if(tmp.get(j)-tmp.get(j-1) > tol && tmp.get(j)-tmp.get(j+1) > tol && tmp.get(j) - pre.get(j) > tol  && tmp.get(j) - pre.get(j-1) > tol && tmp.get(j) - pre.get(j+1) > tol && tmp.get(j) - after.get(j) > tol && tmp.get(j) - after.get(j-1) > tol && tmp.get(j) - after.get(j+1) > tol) {
                    x = i;
                    y = j;
                    number = tmp.get(j);
                    count++;
                }
            }
        }
        if(count == 0) {
            System.out.println("Not Exist");
        }else if(count == 1) {
            System.out.println("(" + (y+1) + "," + " " + (x+1) + ")" + ": " + number);
        }else {
            System.out.println("Not Unique");
        }
    }
}
