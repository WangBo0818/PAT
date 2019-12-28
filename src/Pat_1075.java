import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author wb
 * @date 2019/12/28 - 15:45
 * 1075 链表元素分类
 */
public class Pat_1075 {
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
        Node[] array = new Node[100000];
        List<Node> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String[] str = input.readLine().split(" ");
            Node tmp = new Node(Integer.parseInt(str[0]), Integer.parseInt(str[1]), Integer.parseInt(str[2]));
            array[tmp.address] = tmp;
        }
        // 构建链表
        link(array, list, firstAddress);
        // 将链表元素进行分类
        List<Node> res = typeLink(array, list, k);

        for (int i = 0; i < res.size() - 1; i++) {
            System.out.printf("%05d %d %05d\n", res.get(i).address,
                    res.get(i).data, res.get(i + 1).address);
        }
        int end = res.size() - 1;
        System.out.printf("%05d %d -1", res.get(end).address,
                res.get(end).data);
    }

    public static List<Node> typeLink(Node[] array, List<Node> list, int k) {
        List<Node> res = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).data < 0) {
                // 将负数放到链表前面
                res.add(list.get(i));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).data <= k && list.get(i).data >= 0) {
                // 将小于k的数放入链表
                res.add(list.get(i));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).data > k) {
                // 最后放入大于k的数
                res.add(list.get(i));
            }
        }
        return res;
    }

    public static void link(Node[] array, List<Node> list, int firstAddress) {
        while(firstAddress != -1) {
            list.add(array[firstAddress]);
            firstAddress = array[firstAddress].next;
        }
    }
}
