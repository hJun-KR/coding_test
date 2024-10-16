import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int w = sc.nextInt();
        int v = sc.nextInt();

        int adapterAmpere = w / v;

        if (adapterAmpere >= a) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }
}
