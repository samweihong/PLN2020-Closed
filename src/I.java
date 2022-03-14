import java.util.*;

public class I {
    static Scanner sc = new Scanner(System.in);

    public static void solution() {
        int n = sc.nextInt();
        List<Coordinate> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new Coordinate(sc.nextLong(), sc.nextLong()));
        }
        int count = 0;
        for (int i = 0; i < n; i++)
            for (int j = i+1; j < n; j++) {
                Coordinate point1 = list.get(i);
                Coordinate point2 = list.get(j);
                if (point1.x == point2.x || point1.y == point2.y)
                    continue;
                if (list.contains(new Coordinate(point1.x, point2.y)) &&
                    list.contains(new Coordinate(point2.x, point1.y)))
                    count++;
            }
        System.out.println(count/2);
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            solution();
        }
    }

    static class Coordinate {
        long x;
        long y;

        public Coordinate(long x, long y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Coordinate that = (Coordinate) o;
            return x == that.x && y == that.y;
        }
    }
}