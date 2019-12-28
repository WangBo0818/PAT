import java.util.Scanner;

/**
 * @author wb
 * @date 2019/12/28 - 15:30
 * 1046 划拳
 */
public class Pat_1046 {
    static class huajiu {
        int jiahan;
        int jiahua;
        int yihan;
        int yihua;
        public huajiu(int jiahan, int jiahua, int yihan, int yihua) {
            this.jiahan = jiahan;
            this.jiahua = jiahua;
            this.yihan = yihan;
            this.yihua = yihua;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int countJ = 0;
        int countY = 0;
        for(int i = 0; i < n; i++) {
            huajiu hj = new huajiu(scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt());
            if(hj.jiahan + hj.yihan == hj.jiahua && hj.jiahan + hj.yihan != hj.yihua) {
                countY++;
            }else if(hj.jiahan + hj.yihan == hj.yihua && hj.jiahan + hj.yihan != hj.jiahua) {
                countJ++;
            }
        }
        scan.close();
        System.out.println(countJ + " " + countY);
    }
}
