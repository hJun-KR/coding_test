import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        char[] ch = {'A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u'};

        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            if (str.equals("#")) {
                break;
            }
            
            for (int i = 0; i < str.length(); i++) {
                for (int j = 0; j < ch.length; j++) {
                    if (str.charAt(i) == ch[j]) {
                        count++;
                    }
                }
            }
            System.out.println(count);
            count = 0;
            
        }

    }
}