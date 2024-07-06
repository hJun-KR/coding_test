import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        int a = sc.nextInt();
        int cnt = 0;

        String[] arr = new String[a];

        for (int i = 0; i < a; i++) {
            arr[i] = sc.next();
        }

        for (int i = 0; i < a; i++) {
            if(str.equals(arr[i])) {
                cnt++;
            }
        }

        System.out.println(cnt);

    }
}
