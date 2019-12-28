import java.util.Scanner;

/**
 * @author wb
 * @date 2019/12/28 - 15:07
 * 1003 我要通过！
 */
public class Pat_1003 {
    public static void main(String[] args) {
        int number = 0;
        String string = new String();
        Scanner sc = new Scanner(System.in);
        number = Integer.parseInt(sc.nextLine());
        for(int i=0;i<number;i++)
        {
            string = sc.nextLine();
            String pattern = "A*PA+TA*";
            String pattern1 = "PA+T";
            if(string.matches(pattern)){
                if(string.matches(pattern1)){
                    System.out.println("YES");
                    continue;
                }
                else{
                    String temp[] = string.split("P|T");
                    int a = temp[0].length();
                    int b = temp[1].length();
                    int c = temp[2].length();
                    if((c-a)/a==b-1){
                        System.out.println("YES");
                    }
                    else{
                        System.out.println("NO");
                    }
                }
            }
            else
                System.out.println("NO");
        }
    }
}
