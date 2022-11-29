import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int x1 = 4, x2 = 3, x3 = 2, x4 = 1;
        int m1 = Math.max(x1, x2), m2 = Math.max(x3, x4);
        int m = Math.max(m1, m2);
        System.out.println(m);
    }
}