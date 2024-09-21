import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int Ur = sc.nextInt() * 56;
        int Tr = sc.nextInt() * 24;
        int Uo = sc.nextInt() * 14;
        int To = sc.nextInt() * 6;
        int total = Ur + Tr + Uo + To;
        
        System.out.println(total);
        
    }
}