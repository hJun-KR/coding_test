import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int blank = n-1;
    int star = 1;

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < blank; j++) {
            System.out.print(" ");
        }
        for (int j = 0; j < star; j++) {
            System.out.print("*");
        }
        star+=2;
        blank--;
        System.out.println();
    }
    blank = 1;
    star = n*2-3;
    for (int i = 0; i < n-1; i++) {
        for (int j = blank; j > 0; j--) {
            System.out.print(" ");
        }
        for (int j = star; j > 0; j--) {
            System.out.print("*");
        }
        star-=2;
        blank++;
        System.out.println();
    }

    }
}