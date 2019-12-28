import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author wb
 * @date 2019/12/28 - 15:56
 * 1080 MOOC期终成绩
 */
public class Pat_1080 {
    static class Student {
        String id;
        int onlineScore;
        float mid_term;
        double final_term;
        int realScore;
        Student(String id, int onlineScore) {
            this.id = id;
            this.onlineScore = onlineScore;
        }
        Student(String id, float mid_term) {
            this.id = id;
            this.mid_term = mid_term;
        }
        Student(String id, double final_term) {
            this.id = id;
            this.final_term = final_term;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = input.readLine().split(" ");
        int p = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);
        int n = Integer.parseInt(arr[2]);
        List<Student> list = new ArrayList<>();
        for(int i = 0; i < p; i++) {
            String[] tmp = input.readLine().split(" ");
            list.add(new Student(tmp[0], Integer.parseInt(tmp[1])));
        }
        for(int i = 0; i < m; i++) {
            String[] tmp = input.readLine().split(" ");
            boolean flag = false;
            String id = tmp[0];
            for(int j = 0; j < list.size(); j++) {
                if(id.equals(list.get(j).id)) {
                    list.get(j).mid_term = Float.valueOf(tmp[1]);
                    flag = true;
                    break;
                }
            }
            if(flag) {
                continue;
            }else {
                list.add(new Student(id, Float.valueOf(tmp[1])));
            }
        }
        for(int i = 0; i < n; i++) {
            String[] tmp = input.readLine().split(" ");
            boolean flag = false;
            String id = tmp[0];
            for(int j = 0; j < list.size(); j++) {
                if(id.equals(list.get(j).id)) {
                    list.get(j).final_term = Double.valueOf(tmp[1]);
                    flag = true;
                    break;
                }
            }
            if(flag) {
                continue;
            }else {
                list.add(new Student(id, Double.valueOf(tmp[1])));
            }
        }

        for(int i = 0; i < list.size(); i++) {
            //Student stu = list.get(i);
            if(list.get(i).mid_term > list.get(i).final_term) {
                list.get(i).realScore = (int)Math.round(list.get(i).mid_term*0.4 + list.get(i).final_term*0.6);
            }else {
                list.get(i).realScore = (int) list.get(i).final_term;
            }
        }
        Collections.sort(list, new Comparator<Student>() {

            @Override
            public int compare(Student o1, Student o2) {
                if(o1.realScore > o2.realScore) {
                    return -1;
                }else if(o1.realScore < o2.realScore) {
                    return 1;
                }else {
                    return o1.id.compareTo(o2.id);
                }
            }

        });
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).onlineScore >= 200 && list.get(i).realScore >= 60) {
                if(list.get(i).mid_term == 0) {
                    System.out.println(list.get(i).id + " " + list.get(i).onlineScore + " " + "-1" + " " + (int)list.get(i).final_term + " " + list.get(i).realScore);
                }else {
                    System.out.println(list.get(i).id + " " + list.get(i).onlineScore + " " + (int)list.get(i).mid_term + " " + (int)list.get(i).final_term + " " + list.get(i).realScore);
                }
            }
        }
    }
}
