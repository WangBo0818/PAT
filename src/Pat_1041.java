import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author wb
 * @date 2019/12/28 - 15:29
 * 1041 考试座位号
 */
public class Pat_1041 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        for(int i = 0; i < N; i++) {
            list.add(new Student(scan.next(), scan.nextInt(), scan.nextInt()));
        }
        int M = scan.nextInt();
        int[] arr = new int[M];
        for(int i = 0; i < M; i++) {
            arr[i] = scan.nextInt();
        }
        scan.close();
        for(int i = 0; i < M; i++) {
            for(int j = 0; j < list.size(); j++) {
                if(arr[i] == list.get(j).jishi) {
                    System.out.println(list.get(j).id + " " + list.get(j).kaoshi);
                    break;
                }
            }
        }
    }

    static class Student {
        String id;
        int jishi;
        int kaoshi;
        Student(String id, int jishi, int kaoshi) {
            this.id = id;
            this.jishi = jishi;
            this.kaoshi = kaoshi;
        }
    }
}
