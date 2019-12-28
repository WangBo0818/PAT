import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author wb
 * @date 2019/12/28 - 15:44
 * 1071 小赌怡情
 */
public class Pat_1071 {
    static class Game {
        int n1;
        int b;
        int t;
        int n2;
        Game(int n1, int b, int t, int n2) {
            this.n1 = n1;
            this.b = b;
            this.t = t;
            this.n2 = n2;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = input.readLine().split(" ");
        int t = Integer.parseInt(arr[0]);
        int k = Integer.parseInt(arr[1]);
        List<Game> list = new ArrayList<>(k);
        for(int i = 0; i < k; i++) {
            String[] tmp = input.readLine().split(" ");
            list.add(new Game(Integer.parseInt(tmp[0]), Integer.parseInt(tmp[1]), Integer.parseInt(tmp[2]), Integer.parseInt(tmp[3])));
        }
        for(int i = 0; i < k; i++) {
            Game game = list.get(i);
            if(t <= 0) {
                System.out.println("Game Over.");
                return;
            }else if(game.t > t) {
                System.out.println("Not enough tokens.  Total = " + t + ".");
            }else if((game.n1 > game.n2 && game.b == 0) || (game.n1 < game.n2 && game.b == 1)) {
                // 赢
                t += game.t;
                System.out.println("Win " + game.t + "!  " + "Total = " + t + ".");
            }else {
                // 输
                t -= game.t;
                System.out.println("Lose " + game.t + ".  " + "Total = " + t + ".");
            }
        }
    }
}
