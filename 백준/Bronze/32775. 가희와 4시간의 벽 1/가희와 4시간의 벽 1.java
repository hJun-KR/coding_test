import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int f = sc.nextInt();
        
        if (s <= f) {
            System.out.println("high speed rail");
        } else {
            System.out.println("flight");
        }
        
    }
}
