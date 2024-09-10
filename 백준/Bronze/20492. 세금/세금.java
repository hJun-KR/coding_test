import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = (int)(a * 0.78);
        int c = (int)(a * 0.8 + a * 0.2 * 0.78);

        System.out.println(b + " " + c);

    }
}