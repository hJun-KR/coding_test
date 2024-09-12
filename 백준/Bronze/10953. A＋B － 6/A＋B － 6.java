import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String str = sc.next();
            char ch1 = str.charAt(0);
            char ch2 = str.charAt(2);

            System.out.println(ch1 - '0' + ch2 - '0');

        }

    }
}