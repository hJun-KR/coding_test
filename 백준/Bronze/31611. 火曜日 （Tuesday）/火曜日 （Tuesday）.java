import java.util.Scanner;

public class Main {
    public static void solve() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        System.out.println(x % 7 == 2 ? "1" : "0");
    }

    public static void main(String[] args) {
        solve();
    }
}