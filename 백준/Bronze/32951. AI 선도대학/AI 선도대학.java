import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final int year = 2024;
        int newYear = sc.nextInt();
        
        System.out.println(newYear - year);
        
    }
}