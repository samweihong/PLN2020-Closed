import java.util.Scanner;

public class F {
    static Scanner sc = new Scanner(System.in);

    public static void solution() {
        int n0 = sc.nextInt();
        int n1 = 3 * n0;
        boolean isOdd = n1 % 2 == 1;
        String par = isOdd ? "odd " : "even ";

        int n2 = n1;
        if (isOdd) n2++;
        n2 /= 2;

        int n3 = 3 * n2;
        int n4 = n3 / 9;
        System.out.println(par + n4);
    }

    public static void main(String[] args) {
        int x = sc.nextInt();
        for (int i = 0; i < x; i++) {
            solution();
        }
    }
}
