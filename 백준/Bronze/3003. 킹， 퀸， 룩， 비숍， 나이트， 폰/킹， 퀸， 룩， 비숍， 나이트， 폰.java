import java.util.Scanner;

public class Main {
    public static void main (  String[] args ) {
        Scanner sc = new Scanner(System.in);
        int a = 1 - sc.nextInt();
        int b = 1 - sc.nextInt();
        int c = 2 - sc.nextInt();
        int d = 2 - sc.nextInt();
        int e = 2 - sc.nextInt();
        int f = 8 - sc.nextInt();

        System.out.printf("%d %d %d %d %d %d", a, b, c, d, e, f);
    }
}
