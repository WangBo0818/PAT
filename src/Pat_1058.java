import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author wb
 * @date 2019/12/28 - 15:35
 * 1058 选择题
 */
public class Pat_1058 {
    static class Exam {
        int score;
        String rightAns;
        Exam(int score, String rightAns) {
            this.score = score;
            this.rightAns = rightAns;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String[] ss = input.readLine().split(" ");
        int n = Integer.parseInt(ss[0]);
        int m = Integer.parseInt(ss[1]);
        int[] wrong = new int[m];
        List<Exam> list = new ArrayList<>(m);

        for(int i = 0; i < m; i++) {
            String str = input.readLine();
            list.add(new Exam(str.charAt(0)-'0', str.substring(4)));
        }

        List<String> tmp = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            tmp.add(input.readLine());
        }
        int[] score = new int[n];
        for(int i = 0; i < n; i++) {
            String s = tmp.get(i);
            s = s.substring(s.indexOf('(')+1, s.lastIndexOf(')'));
            String[] array = s.split("\\)\\s*\\(");
            for(int j = 0; j < array.length; j++) {
                if(array[j].equals(list.get(j).rightAns)) {
                    score[i] += list.get(j).score;
                }else {
                    wrong[j]++;
                }
            }
            System.out.println(score[i]);
        }

        int maxError = 0;
        for(int i = 1; i < m; i++) {
            if(wrong[i] > wrong[maxError]) {
                maxError = i;
            }
        }
        if(0 == wrong[maxError]) {
            System.out.print("Too simple");
        }else {
            System.out.print(wrong[maxError]);
            for(int i = 0; i < m; i++) {
                if(wrong[i] == wrong[maxError]) {
                    System.out.print(" " + (i+1));
                }
            }
        }
    }
}
