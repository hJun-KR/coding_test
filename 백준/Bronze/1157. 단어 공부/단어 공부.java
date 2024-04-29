import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int[] a = new int[26];

        for (int i = 0; i < str.length(); i++) {
            if (65 <= str.charAt(i) && str.charAt(i) <= 90) {
                a[str.charAt(i) - 65]++;
            } else {
                a[str.charAt(i) - 97]++;
            }
        }

        int count = 0;
        char ch = ' ';

        for (int i = 0; i < 26; i++) {
            if (a[i] > count) {
                count = a[i];
                ch = (char)(i+65);
            } else if (a[i] == count ) {
                ch = '?';
            }
        }

        System.out.println(ch);
    }
}
