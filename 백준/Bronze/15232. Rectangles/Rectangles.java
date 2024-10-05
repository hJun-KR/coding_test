import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int R = sc.nextInt();
        int C = sc.nextInt();
        
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}