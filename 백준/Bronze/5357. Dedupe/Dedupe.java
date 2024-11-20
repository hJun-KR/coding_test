import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                int n = sc.nextInt();
                sc.nextLine();

                for (int i = 0; i < n; i++) {
                        String string = sc.nextLine();

                        StringBuilder sb = new StringBuilder();
                        sb.append(string.charAt(0));
                        for (int j = 1; j < string.length(); j++) {
                                if (string.charAt(j) != string.charAt(j-1)) {
                                        sb.append(string.charAt(j));
                                }
                        }

                        System.out.println(sb.toString());
                }

        }
}