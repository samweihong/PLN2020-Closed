import java.util.Scanner;

public class H {
    static Scanner sc = new Scanner(System.in);

    public static void solution() {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Invalid");
            return;
        }
        if (a == b && a == c)
            System.out.println("Equilateral");
        else if (a == b || a == c || b == c)
            System.out.println("Isosceles");
        else
            System.out.println("Scalene");
    }

    public static void main(String[] args) {
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            solution();
        }
    }
}
