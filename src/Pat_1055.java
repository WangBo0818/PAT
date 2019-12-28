import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @author wb
 * @date 2019/12/28 - 15:35
 * 1055 集体照
 */
public class Pat_1055 {
    static class Student {
        String name;
        int height;
        Student(String name, int height) {
            this.name = name;
            this.height = height;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = input.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int k = Integer.parseInt(arr[1]);
        List<Student> list = new ArrayList<>();
        for(int i = 0; i < n ; i++) {
            String[] str = input.readLine().split(" ");
            list.add(new Student(str[0], Integer.parseInt(str[1])));
        }
        Collections.sort(list, new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.height > o2.height) {
                    return 1;
                }else if(o1.height < o2.height) {
                    return -1;
                }else {
                    return o2.name.compareTo(o1.name);
                }
            }
        });

        // 创建一个栈，用来存储每一个的运行结果
        Stack<String> stack = new Stack<>();

        // 每排的人数
        int number = n / k;
        for(int i = 0; i < k; i++) {
            if(i != k-1) {
                // 不是最后一排
                // 该排中最高的一个人
                StringBuilder sb = new StringBuilder(list.get((i+1)*number - 1).name + " ");
                boolean flag = false;
                for(int j = (i+1)*number - 2; j >= i*number; j--) {
                    if(flag) {
                        // 插入右边
                        sb.append(list.get(j).name).append(" ");
                        flag = false;
                    }else {
                        // 插入左边
                        sb.insert(0, list.get(j).name + " ");
                        flag = true;
                    }
                }
                stack.push(sb.toString().trim());
            }else {
                // 最后一排
                StringBuilder sb = new StringBuilder(list.get(list.size() - 1).name + " ");
                boolean flag = false;
                for(int j = list.size()-2; j >= i*number; j--) {
                    if(flag) {
                        sb.append(list.get(j).name).append(" ");
                        flag = false;
                    }else {
                        sb.insert(0, list.get(j).name + " ");
                        flag = true;
                    }
                }
                stack.push(sb.toString().trim());
            }
        }
        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
