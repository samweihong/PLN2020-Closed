import java.util.Scanner;

public class G {
    static Scanner sc = new Scanner(System.in);

    public static void solution() {
        String M = sc.nextLine();
        int N = M.length();
        char[] front = M.substring(0, N/2).toCharArray();
        char[] back = M.substring(N/2).toCharArray();
        rotate(front);
        rotate(back);
        for (int i = 0; i < N/2; i++)
            front[i] = (char) ((front[i] + back[i] - 2*'A') % 26 + 'A');
        System.out.println(String.valueOf(front));
    }

    public static void rotate(char[] s) {
        int sum = 0;
        for (char c : s)
            sum += c - 'A';
        for (int i = 0; i < s.length; i++)
            s[i] = (char) ((s[i] - 'A' + sum) % 26 + 'A');
    }

    public static void main(String[] args) {
        int T = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < T; i++) {
            solution();
        }
    }
}
