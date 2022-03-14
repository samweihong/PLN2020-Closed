import java.util.*;

public class C {
    static Scanner sc = new Scanner(System.in);
    static Map<Integer, Node> map = new HashMap<>();
    static Map<Integer, Long> dp = new HashMap<>();

    public static void solution() {
        int p = sc.nextInt();
        System.out.println(map.get(p).getMemory());
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        int q = sc.nextInt();

        map.put(0, new Node(0, 0));
        for (int i = 0; i < n; i++) {
            int pid = sc.nextInt();
            int ppid = sc.nextInt();
            int memory = sc.nextInt();
            map.put(pid, new Node(pid, memory));
            map.get(ppid).children.add(pid);
        }

        for (int i = 0; i < q; i++) {
            solution();
        }
    }

    static class Node {
        int pid;
        int memory;
        List<Integer> children;

        public Node(int pid, int memory) {
            this.pid = pid;
            this.memory = memory;
            children = new ArrayList<>();
        }

        public long getMemory() {
            if (dp.containsKey(pid))
                return dp.get(pid);

            long sum = memory;
            for (int id : children)
                sum += map.get(id).getMemory();
            dp.put(pid, sum);
            return sum;
        }
    }
}
