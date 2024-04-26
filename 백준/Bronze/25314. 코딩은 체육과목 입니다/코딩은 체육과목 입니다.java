import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b;
        String str = "long";
        b = a/4;
        for (int i = 0; i < b; i++) {
            System.out.print(str + " ");
        }
        System.out.println("int");
    }
}