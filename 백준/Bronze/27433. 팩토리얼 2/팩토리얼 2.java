import java.util.*;



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        long b = 1;
        for (int i = 1; i <= a; i++) {
            if (a == 1) {
                b = 1;
            } else if (a == 0) {
                b = 1;
            } else {
                b *= i;
            }
        }
        System.out.println(b);
    }
}
