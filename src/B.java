import java.util.Scanner;

public class B {
    static Scanner sc = new Scanner(System.in);

    public static void solution() {
        String dec = sc.nextLine();
        String bin = sc.nextLine();
        String[] decs = dec.split("\\.");
        String[] bins = bin.split("\\.");

        for (int i = 0; i < 4; i++) {
            if (Integer.parseInt(bins[i], 2) != Integer.parseInt(decs[i])) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }

    public static void main(String[] args) {
        int N = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= N; i++) {
            System.out.print("Case " + i + ": ");
            solution();
        }
    }
}
