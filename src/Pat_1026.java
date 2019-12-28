import java.util.Scanner;

/**
 * @author wb
 * @date 2019/12/28 - 15:20
 * 1026 程序运行时间
 */
public class Pat_1026 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int c1 = scan.nextInt();
        int c2 = scan.nextInt();
        scan.close();
        long sec = Math.round((double)(c2 - c1) / 100);
        if(sec < 1) {
            System.out.print("00:00:00");
            return;
        }
        int hour = (int)sec / 3600;
        int yushu = (int)sec % 3600;
        int min = yushu / 60;
        int s = yushu % 60;
        if(hour < 10) {
            System.out.print("0" + hour);
        }else {
            System.out.print(hour);
        }
        if(min < 10) {
            System.out.print(":0" + min);
        }else {
            System.out.print(":" + min);
        }
        if(s < 10) {
            System.out.print(":0" + s);
        }else {
            System.out.print(":" + s);
        }
    }
}
