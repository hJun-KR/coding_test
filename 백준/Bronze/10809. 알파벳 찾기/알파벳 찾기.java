import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        char c = 97; // ASCII value of 'a' is 97
        String newstr = str.trim();
        int a = newstr.length();

        String[] lowercase = new String[26];
        int[] check = new int[26];
        int[] cnt = new int[26];

        for(int i = 0; i < lowercase.length; i++) {
            lowercase[i] = Character.toString(c);
            c++;
        }
        for (int i = 0; i < check.length; i++) {
            check[i] = -1;
        }
        for (int i = 0; i < cnt.length; i++) {
            cnt[i] = 0;
        }
        

        for (int i = 0; i < lowercase.length; i++) {
            for (int j = 0; j < a; j++) {
                if (lowercase[i].equals(Character.toString(newstr.charAt(j))) && cnt[i] == 0) {
                    check[i] = j;
                    cnt[i]++;
                }
            }
           
        }
        for (int i = 0; i < cnt.length; i++) {
            System.out.print(check[i] + " ");
        }

    }
}