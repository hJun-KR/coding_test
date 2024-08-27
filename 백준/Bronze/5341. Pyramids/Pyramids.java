import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            int input = sc.nextInt();
            int sum = 0;
            if (input == 0) {
                break;
            }
            for (int i = input; i > 0; i--) {
                sum += i;
            }
            System.out.println(sum);
        }
        
    }
}