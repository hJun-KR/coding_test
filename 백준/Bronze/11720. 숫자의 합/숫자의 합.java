import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, d = 0;
        char c;
        String b;
        a = sc.nextInt();
        b = sc.next();

        for (int i = 0; i < a; i++) {
            c = b.charAt(i);
            d += Character.getNumericValue(c);
        }
        System.out.println(d);
    }
}