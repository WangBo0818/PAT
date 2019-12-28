import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author wb
 * @date 2019/12/28 - 16:01
 * 1095 解码PAT准考证
 */
public class Pat_1095 {
    static class Case3Result {
        String key;
        int count;
        Case3Result(String key, int count) {
            this.key = key;
            this.count = count;
        }
    }

    static class Student {
        String num;
        int score;
        char level;
        String kaochangNum;
        String date;
        String kaoshengNum;
        Student(String num, int score, char level, String kaochangNum, String date, String kaoshengNum) {
            this.num = num;
            this.score = score;
            this.level = level;
            this.kaochangNum = kaochangNum;
            this.date = date;
            this.kaoshengNum = kaoshengNum;
        }
    }

    static class Statistics {
        int type;
        String zhiling;
        Statistics(int type, String zhiling) {
            this.type = type;
            this.zhiling = zhiling;
        }
    }

    public static void main(String[] args) throws IOException {
        /*Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();*/
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = input.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);
        List<Student> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            /*String s = scan.next();
            int score = scan.nextInt();*/
            String[] tmp = input.readLine().split(" ");
            String s = tmp[0];
            int score = Integer.parseInt(tmp[1]);
            list.add(new Student(s, score, s.charAt(0), s.substring(1, 4), s.substring(4, 10), s.substring(10, 13)));
        }
        List<Statistics> sta = new ArrayList<>();
        for(int i = 0; i < m; i++) {
            String[] tmp = input.readLine().split(" ");
            sta.add(new Statistics(Integer.parseInt(tmp[0]), tmp[1]));
        }

        for(int i = 0; i < sta.size(); i++) {
            int type = sta.get(i).type;
            switch(type) {
                case 1: {
                    System.out.println("Case " + (i+1) + ": " +  "1" + " " + sta.get(i).zhiling);
                    Collections.sort(list, new Comparator<Student>() {
                        @Override
                        public int compare(Student o1, Student o2) {
                            if(o1.score > o2.score) {
                                return -1;
                            }else if(o1.score < o2.score) {
                                return 1;
                            }else {
                                return o1.num.compareTo(o2.num);
                            }
                        }
                    });
                    boolean flag = false;
                    for(int j = 0; j < list.size(); j++) {
                        if(list.get(j).level == sta.get(i).zhiling.charAt(0)) {
                            flag = true;
                        }
                    }
                    if(flag == false) {
                        System.out.println("NA");
                        break;
                    }else {
                        for(int j = 0; j < list.size(); j++) {
                            if(list.get(j).level == sta.get(i).zhiling.charAt(0)) {
                                System.out.println(list.get(j).num + " " + list.get(j).score);
                            }
                        }
                    }

                    break;
                }
                case 2: {
                    System.out.println("Case " + (i+1) + ": " +  "2" + " " + sta.get(i).zhiling);
                    int count = 0;
                    int sum = 0;
                    for(int j = 0; j < list.size(); j++) {
                        if(list.get(j).kaochangNum.equals(sta.get(i).zhiling)) {
                            sum += list.get(j).score;
                            count++;
                        }
                    }
                    if(count == 0 || sum == 0) {
                        System.out.println("NA");
                    }else {
                        System.out.println(count + " " + sum);
                    }
                    break;
                }
                case 3: {
                    System.out.println("Case " + (i+1) + ": " +  "3" + " " + sta.get(i).zhiling);
                    List<Case3Result> result = new ArrayList<>();
                    for(int j = 0; j < list.size(); j++) {
                        if(list.get(j).date.equals(sta.get(i).zhiling)) {
                            String tmp = list.get(j).kaochangNum;
                            int count = 1;
                            for(int l = 0; l < result.size(); l++) {
                                if(result.get(l).key.equals(tmp)) {
                                    result.remove(l);
                                    count++;
                                }
                            }
                            result.add(new Case3Result(tmp, count));
                        }
                    }
                    Collections.sort(result, new Comparator<Case3Result>() {
                        @Override
                        public int compare(Case3Result o1, Case3Result o2) {
                            if(o1.count > o2.count) {
                                return -1;
                            }else if(o1.count < o2.count) {
                                return 1;
                            }else {
                                return o1.key.compareTo(o2.key);
                            }
                        }
                    });
                    if(result.size() == 0) {
                        System.out.println("NA");
                        break;
                    }else {
                        for(int k = 0; k < result.size(); k++) {
                            System.out.println(result.get(k).key + " " + result.get(k).count);
                        }
                    }
                    break;
                }
            }
        }
    }
}
