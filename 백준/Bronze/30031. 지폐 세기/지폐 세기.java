import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b[] = new int[a*2];
        int money = 0;

        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < b.length; i++) {
            if (b[i] == 136) {
                money += 1000;
            }
            else if(b[i] == 142) {
                money += 5000;
            }
            else if(b[i] == 148) {
                money += 10000;
            }
            else if(b[i] == 154) {
                money += 50000;
            }
        }
        System.out.println(money);
    }
}