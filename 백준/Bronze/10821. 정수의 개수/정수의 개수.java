import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int length = str.length();
        char[] ch = new char[length];
        int cnt = 0;

        for (int i = 0; i < length; i++) {
            ch[i] = str.charAt(i);
        }

        for (int i = 0; i < length; i++) {
            if (ch[i] == ',') {
                cnt++;
            }
        }

        System.out.println(cnt + 1);

    }
}