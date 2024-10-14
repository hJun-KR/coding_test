import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        
        double x = Double.parseDouble(input);
        
        int result = (int) Math.floor(x);
        
        System.out.println(result);
    }
}
