import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @author wb
 * @date 2019/12/28 - 15:56
 * 1085 PAT单位排行
 */
public class Pat_1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<School> list = new ArrayList<School>();
        Map<String,Integer> people = new TreeMap<String,Integer>();
        Map<String,Integer> grade = new TreeMap<String,Integer>();
        for(int i=0;i<N;i++) {
            String[] str = br.readLine().toLowerCase().split(" ");
            int gra = 0;
            if(str[0].startsWith("a")) {
                gra = Integer.parseInt(str[1]);
            }
            else if(str[0].startsWith("b")) {
                gra = (int)Math.floor(Double.parseDouble(str[1])/1.5);
            }
            else if(str[0].startsWith("t")) {
                gra = (int)Math.floor(Double.parseDouble(str[1])*1.5);
            }
            if(people.containsKey(str[2])) {
                people.put(str[2], people.get(str[2]) + 1);
                grade.put(str[2], grade.get(str[2]) + gra);
            }
            else {
                people.put(str[2], 1);
                grade.put(str[2], gra);
            }
        }
        for(String key : grade.keySet()) {
            School temp = new School(key,grade.get(key),people.get(key));
            list.add(temp);
        }
        Collections.sort(list);
        School temp = new School("temp",-1,0);
        System.out.println(list.size());
        int show = 1,real = 1;
        for(School sc : list) {
            if(sc.grade == temp.grade) {
                real++;
                System.out.println(show + " " + sc.toString());
            }
            else {
                show = real;
                real++;
                System.out.println(show + " " + sc.toString());
            }
            temp = sc;
        }
    }
}

class School implements Comparable<School> {
    String sname;
    int grade;
    int num;

    public School(String sname,int grade,int num) {
        this.sname = sname;
        this.grade = grade;
        this.num = num;
    }

    @Override
    public int compareTo(School o) {
        if(this.grade==o.grade) {
            if(this.num==o.num) {
                return this.sname.compareTo(o.sname);
            }
            else {
                return this.num - o.num;
            }
        }
        else {
            return o.grade - this.grade;
        }
    }

    @Override
    public boolean equals(Object obj) {
        boolean flag = false;
        if (obj instanceof School) {
            School o = (School) obj;
            flag = (this.sname == o.sname);
        }
        return flag;
    }

    @Override
    public String toString() {
        return sname + " " + grade + " " + num;
    }
}
