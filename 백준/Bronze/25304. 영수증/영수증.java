import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        int n, a, b, d = 0, e = 0;
        n = sc.nextInt();
        for (int i = 1; i < n+1; i++) {
            a = sc.nextInt();
            b = sc.nextInt();

            d = a * b;
            e += d;
        }


        System.out.println((x == e) ? "Yes" : "No");
    }
}