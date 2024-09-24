import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char ch = sc.next().charAt(0);
        
        if (ch == 'M') {
            System.out.println("MatKor");
        } else if (ch == 'W') {
            System.out.println("WiCys");
        } else if (ch == 'C') {
            System.out.println("CyKor");
        } else if (ch == 'A') {
            System.out.println("AlKor");
        } else if (ch == '$') {
            System.out.println("$clear");
        }
    }
}