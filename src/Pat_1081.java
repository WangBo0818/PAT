import java.util.Scanner;

/**
 * @author wb
 * @date 2019/12/28 - 15:56
 * 1081 检查密码
 */
public class Pat_1081 {
    public static void main(String[] agrs) {
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        String[] str=new String[100];
        String[] result=new String[100];
        int i;
        String ch;
        ch=in.nextLine();//吃掉上一个留下的换行符
        for(i=0;i<N;i++)
        {
            int countzimu=0,countshuzi=0;
            int flag=1;
            str[i]=in.nextLine();
            if(str[i].length()<6)	//长度太小
            {
                result[i]="Your password is tai duan le.";
            }
            else
            {
                for(int j=0;j<str[i].length();j++)
                {
                    if(str[i].charAt(j)<='z'&&str[i].charAt(j)>='a'||str[i].charAt(j)<='Z'&&str[i].charAt(j)>='A')
                    {
                        countzimu++;
                    }
                    else if(str[i].charAt(j)<='9'&&str[i].charAt(j)>='0')
                    {
                        countshuzi++;
                    }
                    else if(str[i].charAt(j)!='.')			//不合法字符
                    {
                        result[i]="Your password is tai luan le.";
                        flag=0;
                        break;
                    }
                }
                if(flag==0);
                else if(countshuzi>0&&countzimu>0)
                {
                    result[i]="Your password is wan mei.";
                }
                else if(countshuzi>0&&countzimu==0)
                {
                    result[i]="Your password needs zi mu.";
                }
                else
                {
                    result[i]="Your password needs shu zi.";
                }
            }
        }
        for(i=0;i<N;i++)
        {
            System.out.println(result[i]);
        }
    }
}
