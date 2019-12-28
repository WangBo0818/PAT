import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author wb
 * @date 2019/12/28 - 15:17
 * 1020 月饼
 */
public class Pat_1020 {
    static class Mooncake {
        double count;
        double price;
        double onePrice;
        Mooncake(double count, double price, double onePrice) {
            this.count = count;
            this.price = price;
            this.onePrice = onePrice;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = input.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int d = Integer.parseInt(arr[1]);

        String[] count = input.readLine().split(" ");
        String[] price = input.readLine().split(" ");
        List<Mooncake> list = new ArrayList<>(n);
        for(int i = 0; i < n; i++) {
            list.add(new Mooncake(Double.valueOf(count[i]), Double.valueOf(price[i]),  Double.valueOf(price[i])/Double.valueOf(count[i])));
        }
        Collections.sort(list, new Comparator<Mooncake>(){
            @Override
            public int compare(Mooncake o1, Mooncake o2) {
                if(o1.onePrice > o2.onePrice) {
                    return -1;
                }else if(o1.onePrice < o2.onePrice) {
                    return 1;
                }else {
                    return 0;
                }
            }
        });
        double res = 0.0;
        for(int i = 0; i < n && d >= 0; i++) {
            if(list.get(i).count <= d) {
                res += list.get(i).price;
            }else {
                res += list.get(i).onePrice * d;
            }
            d -= list.get(i).count;
        }
        System.out.printf("%.2f", res);
    }
}
