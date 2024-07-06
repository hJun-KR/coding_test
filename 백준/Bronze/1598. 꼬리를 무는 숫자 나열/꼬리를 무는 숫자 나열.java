import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt() - 1;
        int b = sc.nextInt() - 1;

        int c = a/4 - b/4;
        int d = a%4 - b%4;

        if (c < 0) {
            c = -c;
        }
        if (d < 0) {
            d = -d;
        }

        System.out.println(c+d);
    }
}
