import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        a = 9;
        int[] c = new int[a];
        for (int i = 0; i < a; i++) {
            c[i] = sc.nextInt();
        }

        int d = c[0];

        for (int i = 0; i < a; i++) {
            if (d < c[i]) {
                d = c[i];
            }
        }
        System.out.println(d);
        int e = 0;
        for (int i = 0; i < a; i++) {
            if (d == c[i]) {
                e = i;
            }
        }
        System.out.println(e+1);
    }
}
