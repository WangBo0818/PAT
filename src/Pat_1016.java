import java.util.Scanner;

/**
 * @author wb
 * @date 2019/12/28 - 15:14
 * 1016 部分A+B
 */
public class Pat_1016 {
    public static void main(String[] s){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int  a=sc.nextInt();
            int a1=sc.nextInt();
            int b=sc.nextInt();
            int b1=sc.nextInt();
            String str1="";
            String str2="";
            while(a>0){
                if(a%10==a1){
                    str1+=a1;
                }
                a/=10;
            }
            while(b>0){
                if(b%10==b1){
                    str2+=b1;
                }
                b/=10;
            }

            int a2=str1.length()>0?Integer.valueOf(str1):0;
            int b2=str2.length()>0?Integer.valueOf(str2):0;
            System.out.println(a2+b2);
        }
    }
}
