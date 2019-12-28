import java.util.*;

/**
 * @author wb
 * @date 2019/12/28 - 15:44
 * 1072 开学寄语
 */
public class Pat_1072 {
    static class Student {
        String name;
        int k;
        List<Integer> list;
        Student(String name, int k, List<Integer> list) {
            this.name = name;
            this.k = k;
            this.list = list;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] arr = new int[m];
        for(int i = 0; i < m; i++) {
            arr[i] = scan.nextInt();
        }
        List<Student> stuList = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String name = scan.next();
            int k = scan.nextInt();
            List<Integer> list = new ArrayList<>();
            for(int j = 0; j < k; j++) {
                list.add(scan.nextInt());
            }
            stuList.add(new Student(name, k, list));
        }
        scan.close();
        Set<String> set = new HashSet<>();
        int totalK = 0;
        for(int i = 0; i < stuList.size(); i++) {
            List<Integer> tmp = stuList.get(i).list;
            if(tmp.contains(arr[0]) || tmp.contains(arr[1])) {
                System.out.print(stuList.get(i).name + ": ");
            }
            for(int j = 0; j < tmp.size(); j++) {
                if(tmp.get(j) == arr[0] || tmp.get(j) == arr[1]) {
                    totalK++;
                    set.add(stuList.get(i).name);
                    if(j != tmp.size()-1) {
                        System.out.print(tmp.get(j) + " ");
                    }else {
                        System.out.print(tmp.get(j));
                    }
                }
            }
            if(tmp.contains(arr[0]) || tmp.contains(arr[1])) {
                System.out.println();
            }
        }
        System.out.print(set.size() + " " + totalK);
    }
}
