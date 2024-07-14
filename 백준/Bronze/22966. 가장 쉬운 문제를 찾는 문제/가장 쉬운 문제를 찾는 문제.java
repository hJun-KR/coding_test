import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String[] str = new String[a];
        int[] num = new int[a];

        for (int i = 0; i < a; i++) {
            str[i] = sc.next();
            num[i] = sc.nextInt();
        }

        int minIndex = 0;
        int min = num[0];
        
        for (int i = 0; i < a; i++) {
            if (num[i] < min) {
                min = num[i];
                minIndex = i;  
            }
        }

        System.out.println(str[minIndex]);

    }
}