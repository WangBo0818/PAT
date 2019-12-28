import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author wb
 * @date 2019/12/28 - 15:57
 * 1089 狼人杀-简单版
 */
public class Pat_1089 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());
        // 玩家说的话
        int[] word = new int[n+1];
        for(int i = 1; i <= n; i++) {
            word[i] = Integer.parseInt(input.readLine());
        }
        // 初始未找到狼
        boolean find = false;
        for(int i = 1; i < n && !false; i++) {  // 假设第 i 位是狼，且暂且未找到狼
            for(int j = i+1; j <= n && !false; j++) {    // 假设第 j 位是狼，且暂且未找到狼
                // 判断 i 、j 说的话
                boolean word1 = judge(i ,j, word[i]);
                boolean word2 = judge(i ,j, word[j]);
                // 一真一假
                if((word1 && !word2) || (!word1 && word2)) {
                    // 说谎的“好人”数，按题目要求，其 <= 1
                    int liePeopleNum = 0;
                    for (int k = 1; k <= n && liePeopleNum <= 1; k++) {
                        if(k != i && k != j && !judge(i, j ,word[k])) {
                            liePeopleNum++;
                        }
                    }
                    // 有且仅有一个好人说谎已找到
                    if(1 == liePeopleNum) {
                        find = true;
                        System.out.println(i + " " + j);
                        return;
                    }
                }
            }
        }
        if(false == find) {
            System.out.println("No Solution");
        }
    }

    // 判断玩家说的话是否为真话,w1、w2 是狼，word 是玩家说的话
    public static boolean judge(int w1, int w2, int word) {
        // 说某个玩家为狼，并且该玩家真的是狼
        if(word < 0 && (word+w1 == 0 || word+w2 == 0)) {
            return true;
        }
        // 说某个玩家为人，并且该玩家真的是人
        if(word > 0 && word != w1 && word !=w2) {
            return true;
        }
        return false;
    }
}
