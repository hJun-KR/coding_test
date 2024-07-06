import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        
        switch (a) {
            case 'n': case 'N':
                System.out.println("Naver D2");
                break;
        
            default:
                System.out.println("Naver Whale");
                break;
        }

    }
}
