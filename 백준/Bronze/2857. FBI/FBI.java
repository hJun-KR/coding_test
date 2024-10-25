import java.util.Scanner;

public class Main {
        public static void main(String [] args) {
                Scanner sc = new Scanner(System.in);
                String[] agents = new String[5];

                for (int i = 0; i < 5; i++) {
                        agents[i] = sc.nextLine();
                }

                boolean foundFBI = false;
                for (int i = 0; i < 5; i++) {
                        if (agents[i].contains("FBI")) {
                                System.out.print((i + 1) + " ");
                                foundFBI = true;
                        }
                }
                if (!foundFBI) {
                        System.out.println("HE GOT AWAY!");
                }

        }
}