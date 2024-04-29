import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        char[] file = null;
        char[] file2 = null;

        for(int i = 0; i < N; i++) {
            if(i == 0) {
                file = sc.next().toCharArray();
            }
            else {
                file2 = sc.next().toCharArray();
                for(int j = 0; j < file.length; j++) {
                    if(file[j] != file2[j]) {
                        file[j] = '?';
                    }
                }
            }
        }
        for(int i = 0; i < file.length; i++) {
            System.out.print(file[i]);
        }

    }
}