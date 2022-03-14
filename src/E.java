import java.util.Scanner;

public class E {
    static Scanner sc = new Scanner(System.in);
    static int[] denomination = new int[]{1,5,10,25,50};
    static int[][] dp = new int[7490][5];

    public static int getCoins(int amount, int coins) {
        if (amount == 0) return 1;
        if (amount < 0 || coins == -1) return 0;
        if (dp[amount][coins] != 0)
            return dp[amount][coins];
        int sum = getCoins(amount-denomination[coins], coins)
                + getCoins(amount, coins-1);
        dp[amount][coins] = sum;
        return sum;
    }

    public static void solution() {
        int c = sc.nextInt();
        System.out.println(getCoins(c, 4));
    }

    public static void main(String[] args) {
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            solution();
        }
    }
}
