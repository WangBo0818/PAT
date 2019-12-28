import java.util.*;

/**
 * @author wb
 * @date 2019/12/28 - 15:08
 * 1004 成绩排名
 */
public class Pat_1004 {
    static class Student {
        String name;
        String sid;
        int score;
        Student(String name, String sid, int score) {
            this.name = name;
            this.sid = sid;
            this.score = score;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Student> list = new ArrayList<>();
        int n = scan.nextInt();
        for(int i = 0; i < n; i++) {
            list.add(new Student(scan.next(), scan.next(), scan.nextInt()));
        }
        scan.close();
        Collections.sort(list, new Comparator<Student>() {

            @Override
            public int compare(Student o1, Student o2) {
                if(o1.score > o2.score) {
                    return 1;
                }else if(o1.score < o2.score) {
                    return -1;
                }else {
                    return 0;
                }
            }
        });
        System.out.println(list.get(list.size()-1).name + " " + list.get(list.size()-1).sid);
        System.out.println(list.get(0).name + " " + list.get(0).sid);
    }
}
