import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = 64;
        b = sc.nextInt();
        int c = 0;
        while (b > 0) {
            if (a > b) {
                a /= 2;
            } else {
                c++;
                b -= a;
            }
        }
        System.out.println(c);
    }
}


