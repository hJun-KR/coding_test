import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        int year = 2024;
        int month = 1;

        for (int i = 0; i < N; i++) {
            month += 7;
        }
        
        if (month > 12) {
            year += month / 12;
            month = month % 12;
        }
        
        if (month == 0) {
            year--;
            month = 12;
        }
        
        System.out.println(year + " " + month);
        
    }
}