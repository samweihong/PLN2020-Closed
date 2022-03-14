import java.util.Scanner;

public class J {
    static Scanner sc = new Scanner(System.in);

    public static void solution() {
        String line = sc.nextLine();
        while (!line.isEmpty()) {
            String[] words = line.split("\s+");
            StringBuilder res = new StringBuilder();
            int i = 0;
            for (String word : words) {
                if (i >= word.length())
                    continue;
                res.append(word.charAt(i++));
            }
            System.out.println(res);
            if (!sc.hasNextLine())
                return;
            line = sc.nextLine();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int T = sc.nextInt();
        sc.nextLine();
        sc.nextLine();
        for (int i = 0; i < T; i++) {
            solution();
        }
    }
}
