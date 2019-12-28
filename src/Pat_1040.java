import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author wb
 * @date 2019/12/28 - 15:29
 * 1040 有几个PAT
 */
public class Pat_1040 {
    public static void main(String[] args) throws IOException {
        //Scanner scan = new Scanner(System.in);
        //String s = scan.nextLine();
        //scan.close();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String s = input.readLine();
        int p = 0;
        int pa = 0;
        int pat = 0;
        for(int i = 0; i< s.length(); i++) {
            char c = s.charAt(i);
            if(c == 'P') {
                p++;
            }else if(c == 'A') {
                pa += p;
                pa = pa % 1000000007;
            }else {
                pat += pa;
                pat = pat % 1000000007;
            }
        }
        System.out.println(pat);
    }
}
