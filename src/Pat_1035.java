import java.util.Arrays;
import java.util.Scanner;

/**
 * @author wb
 * @date 2019/12/28 - 15:25
 * 1035 插入与归并
 */
public class Pat_1035 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];//原始的
        int[] b = new int[n];//部分排序过的
        for(int i = 0;i<n;i++)
            a[i] = in.nextInt();
        for(int i = 0;i<n;i++)
            b[i] = in.nextInt();
        String type = "Insertion Sort";
        int index = 0;
        for(int i = 0;i<n-1;i++){
            if(b[i]>b[i+1]){
                index = i+1;//从i+1这里开始无序
                break;
            }
        }
        for(int i = index;i<n;i++){
            if(a[i]!=b[i]){
                type = "Merge Sort";//如果是插入排序，从index开两个数组的顺序是一样的
                break;
            }
        }
        if(type.equals("Insertion Sort")){
            int num = b[index];
            for(int j = index;j>0;j--){
                if(b[j]<b[j-1]){
                    b[j] = b[j-1];
                    b[j-1] = num;
                }
            }
        }else{
            //如果是归并排序 index的值表示这么多的规模已经排序完，
            //比如index==2 说明规模为2的已经排序完 下一次排序规模为4
            index = 2*index;
            for(int i = 0;i<n;i+=index){
                int next = i+index>n?n:i+index;
                Arrays.sort(b,i,next);
            }
        }
        System.out.println(type);
        for(int i = 0;i<n-1;i++)
            System.out.print(b[i]+" ");
        System.out.print(b[n-1]);
    }
}
