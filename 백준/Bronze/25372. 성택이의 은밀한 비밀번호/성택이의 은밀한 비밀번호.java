import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int repeat = sc.nextInt();

        for (int i = 0; i < repeat; i++) {
            String str = sc.next();

            int length = str.length();
            if (length >= 6 && length <= 9) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }

        }

    }
}