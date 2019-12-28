import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author wb
 * @date 2019/12/28 - 15:20
 * 1025 反转链表
 */
public class Pat_1025 {
    static class Node {
        int address;
        int data;
        int next;
        Node(int address, int data, int next) {
            this.address = address;
            this.data = data;
            this.next = next;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = input.readLine().split(" ");
        int firstAddress = Integer.parseInt(arr[0]);
        int n = Integer.parseInt(arr[1]);
        int k = Integer.parseInt(arr[2]);
        // 存入结点地址的数组
        Node[] list = new Node[100000];
        for(int i = 0; i < n; i++) {
            String[] a = input.readLine().split(" ");
            Node tmp = new Node(Integer.parseInt(a[0]), Integer.parseInt(a[1]), Integer.parseInt(a[2]));
            list[tmp.address] = tmp;
        }
        List<Node> array = new ArrayList<>();
        // 构建链表
        link(list, firstAddress, array);
        // 反转链表
        reverse(array, k);

        for (int i = 0; i < array.size() - 1; i++) {
            System.out.printf("%05d %d %05d\n", array.get(i).address,
                    array.get(i).data, array.get(i + 1).address);
        }
        int end = array.size() - 1;
        System.out.printf("%05d %d -1", array.get(end).address,
                array.get(end).data);
    }

    private static void reverse(List<Node> array, int k) {
        for(int i = 0; i + k <= array.size(); i += k) {
            int m = i + k - 1;
            int n = i;
            while(n <= m) {
                Node tmp = array.get(n);
                array.set(n, array.get(m));
                array.set(m, tmp);
                n++;
                m--;
            }
        }
    }

    private static void link(Node[] list, int firstAddress, List<Node> array) {
        // -1 表示空
        while (firstAddress != -1) {
            array.add(list[firstAddress]);
            firstAddress = list[firstAddress].next;
        }
    }
}
