import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();

        char ch1 = str.charAt(2);
        char ch2 = str.charAt(1);
        char ch3 = str.charAt(0);
        
        System.out.println(ch1 + "" + ch2 + "" + ch3);
        
    }
}