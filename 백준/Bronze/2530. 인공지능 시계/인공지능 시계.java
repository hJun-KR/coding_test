import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int time = sc.nextInt();

        c += time;
        b += c/60;
        c %= 60;
        a += b/60;
        b %= 60;
        a %= 24;

        System.out.println(a + " " + b + " " + c);
    }
}