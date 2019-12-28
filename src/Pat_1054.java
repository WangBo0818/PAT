import java.util.Scanner;

/**
 * @author wb
 * @date 2019/12/28 - 15:34
 * 1054 求平均值
 */
public class Pat_1054 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        String s = scan.nextLine();
        scan.close();
        String[] nums = s.split(" ");
        double sum = 0;
        double count = 0;
        for(int i = 0; i < n; i++) {
            try {
                double num = Double.valueOf(nums[i]);
                int times = 0;
                if(nums[i].contains(".")) {
                    times = nums[i].length() - nums[i].indexOf(".") - 1;
                }
                if(num >= -1000 && num <= 1000 && times <= 2 && times >= 0) {
                    count++;
                    sum += num;
                }else {
                    throw new Exception();
                }
            }catch(Exception e) {
                System.out.printf("ERROR: %s is not a legal number\n", nums[i]);
            }
        }
        if(count == 0) {
            System.out.printf("The average of %.0f numbers is Undefined", count);
        }else if(count == 1) {
            System.out.printf("The average of %.0f number is %.2f\n", count, sum / count);
        }else {
            System.out.printf("The average of %.0f numbers is %.2f\n", count, sum / count);
        }
    }
}
