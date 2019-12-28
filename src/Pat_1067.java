import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author wb
 * @date 2019/12/28 - 15:40
 * 1067 试密码
 */
public class Pat_1067 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String password = scan.next();
        int n = scan.nextInt();
        List<String> list = new ArrayList<>();
        boolean flag = true;
        while(flag) {
            String str = scan.nextLine();
            if("#".equals(str)) {
                flag = false;
            }else {
                list.add(str);
            }
        }
        scan.close();
        list.remove(0);
        int count = 1;
        for(int i = 0; i < list.size(); i++) {
            if(count > n) {
                System.out.println("Account locked");
            }else if(!(list.get(i).equals(password))) {
                System.out.println("Wrong password:" + " " + list.get(i));
                if(count == n) {
                    System.out.println("Account locked");
                    return;
                }
            }else {
                System.out.println("Welcome in");
                return ;
            }
            count++;
        }
    }
}
