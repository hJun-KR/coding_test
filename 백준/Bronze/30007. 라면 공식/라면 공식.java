import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b, c, d;
        for (int i = 0; i < a; i++) {
            b = sc.nextInt();
            c = sc.nextInt();
            d = sc.nextInt();

            System.out.println(b * (d - 1) + c);
        }
    }
}