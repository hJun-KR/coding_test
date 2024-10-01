import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] correctAnswer = {"Never gonna give you up",
                "Never gonna let you down",
                "Never gonna run around and desert you",
                "Never gonna make you cry",
                "Never gonna say goodbye",
                "Never gonna tell a lie and hurt you",
                "Never gonna stop"};

        boolean check = true;
        int n = sc.nextInt();
        int cnt = 0;

        String[] str = new String[n+1];


        for (int i = 0; i < str.length; i++) {
            str[i] = sc.nextLine();
        }

        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < correctAnswer.length; j++) {
                if (str[i].equals(correctAnswer[j])) {
                    cnt++;
                }
            }
        }

        if (cnt == n) {
            check = false;
        }

        if (check) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}