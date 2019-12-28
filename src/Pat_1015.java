import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author wb
 * @date 2019/12/28 - 15:14
 * 1015 德才论
 */
public class Pat_1015 {
    public static void main(String[] args) throws IOException {
        /*Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();
        int H = sc.nextInt();*/
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = input.readLine().split(" ");
        int N = Integer.parseInt(arr[0]);
        int L = Integer.parseInt(arr[1]);
        int H = Integer.parseInt(arr[2]);

        List<Student> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String[] arr1 = input.readLine().split(" ");
            list.add(new Student(Integer.parseInt(arr1[0]), Integer.parseInt(arr1[1]), Integer.parseInt(arr1[2])));
        }
        List<Student> list1 = new ArrayList<>();
        List<Student> list2 = new ArrayList<>();
        List<Student> list3 = new ArrayList<>();
        List<Student> list4 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).cScore >= H && list.get(i).dScore >= H) {
                list1.add(list.get(i));
            } else if (list.get(i).cScore >= L && list.get(i).cScore < H
                    && list.get(i).dScore >= H) {
                list2.add(list.get(i));
            } else if (list.get(i).dScore >= L && list.get(i).cScore >= L
                    && list.get(i).cScore < H && list.get(i).dScore < H
                    && list.get(i).dScore >= list.get(i).cScore) {
                list3.add(list.get(i));
            } else if (list.get(i).dScore >= L && list.get(i).cScore >= L) {
                list4.add(list.get(i));
            }
        }

        Collections.sort(list1, c);
        Collections.sort(list2, c);
        Collections.sort(list3, c);
        Collections.sort(list4, c);
        System.out.println(list1.size() + list2.size() + list3.size() + list4.size());
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i).toString());
        }
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i).toString());
        }
        for (int i = 0; i < list3.size(); i++) {
            System.out.println(list3.get(i).toString());
        }
        for (int i = 0; i < list4.size(); i++) {
            System.out.println(list4.get(i).toString());
        }
    }

    static Comparator<Student> c = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            if (o1.getTotalScore() > o2.getTotalScore()) {
                return -1;
            } else if (o1.getTotalScore() < o2.getTotalScore()) {
                return 1;
            } else {
                if (o1.dScore > o2.dScore) {
                    return -1;
                } else if (o1.dScore < o2.dScore) {
                    return 1;
                } else {
                    if (o1.id > o2.id) {
                        return 1;
                    } else if (o1.id < o2.id) {
                        return -1;
                    } else {
                        return 0;
                    }
                }
            }
        }
    };

    static class Student {
        int id;
        int dScore;
        int cScore;

        Student(int id, int dScore, int cScore) {
            this.id = id;
            this.dScore = dScore;
            this.cScore = cScore;
        }

        public int getTotalScore() {
            return dScore + cScore;
        }

        public String toString() {
            return id + " " + dScore + " " + cScore;
        }
    }
}
