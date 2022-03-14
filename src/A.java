import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A {
    static Scanner sc = new Scanner(System.in);
    static Map<Character, String> map = new HashMap<>();

    public static void solution() {
        String line = sc.nextLine();
        StringBuilder s = new StringBuilder();
        for (char c : line.toCharArray())
            s.append(map.get(Character.toLowerCase(c)));
        System.out.println(s);
    }

    public static void main(String[] args) {
        int key = 2;
        for (char c = 'a'; c <= 'z'; key++) {
            String s = "" + key;
            map.put(c++, s);
            map.put(c++, s.repeat(2));
            map.put(c++, s.repeat(3));
            if (c == 's' || c == 'z')
                map.put(c++, s.repeat(4));
        }
        map.put(' ', "0");

        int N = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < N; i++) {
            solution();
        }
    }
}
