import java.util.Scanner;

/**
 * @author wb
 * @date 2019/12/28 - 15:45
 * 1078 字符串压缩与解压
 */
public class Pat_1078 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char a = in.nextLine().charAt(0);
        StringBuilder output = new StringBuilder();
        String input = in.nextLine();
        in.close();
        // 压缩
        if (a == 'C') {
            char last = input.charAt(0);
            int index = 1;
            for (int i = 1; i < input.length(); i++) {
                char now = input.charAt(i);
                if (now == last) {
                    index++;
                    // 加入队列的边界一：相同且到最后
                    if (i == input.length() - 1)
                        output.append(index);
                } else {
                    // 边界二：发生变化
                    // 当数字是1时，只加入字符
                    if (index != 1)
                        output.append(index);
                    output.append(last);
                    last = now;// 更新上一个字符
                    index = 1;// 更新计数器
                }
            }
            output.append(last);
            System.out.println(output);
        }
        // 解压
        else {
            int num = 0;
            for (int i = 0; i < input.length(); i++) {
                char now = input.charAt(i);
                if (now <= '9' && now >= '0') {
                    // 判断是不是数字，累加
                    num = num * 10 + (now - '0');
                } else {
                    if (num == 0)
                        // 当num为零，既字符前没有数，只将字符加入字符串
                        output.append(input.charAt(i));
                    for (int j = 0; j < num; j++) {
                        // 循环加字符串
                        output.append(input.charAt(i));
                    }
                    num = 0;
                }
            }
            System.out.println(output);
        }
    }
}
