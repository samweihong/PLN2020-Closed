import java.math.BigInteger;
import java.util.Scanner;

public class D {
    static Scanner sc = new Scanner(System.in);

    public static BigInteger gcd(BigInteger a, BigInteger b) {
        if (b.equals(BigInteger.valueOf(0))) return a;
        return gcd(b, a.remainder(b));
    }

    public static void solution() {
        int n = sc.nextInt();
        BigInteger res = BigInteger.ONE;
        for (int i = 0; i < n; i++) {
            BigInteger desec = BigInteger.valueOf(sc.nextInt());
            res = res.divide(gcd(res, desec)).multiply(desec);
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        int T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            System.out.print("Case " + i + ": ");
            solution();
        }
    }
}
