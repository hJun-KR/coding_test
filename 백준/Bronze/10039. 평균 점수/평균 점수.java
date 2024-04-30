import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int b;
        int c = 0;
        for (int i = 0; i < 5; i++) {
            b = sc.nextInt();
            if (b < 40) {
                b = 40;
            }
            c += b;
        }
        c /= 5;
        System.out.println(c);
    }
}