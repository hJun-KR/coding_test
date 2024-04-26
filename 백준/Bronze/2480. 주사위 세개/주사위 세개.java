import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a == b && b == c) {
            d = 10000 + (a * 1000);
        } else if (a == b || a == c) {
            d = 1000 + (a * 100);
        } else if (b == c) {
            d = 1000 + (b * 100);
        } else {
            d = Math.max(a, Math.max(b, c)) * 100;
        }
        System.out.println(d);
    }
}
