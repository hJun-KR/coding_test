import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] str = new String[3][3];
        
        for(int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length; j++) {
                if (i == 1 && j == 1) {
                    str[i][j] = ":" + sc.next() + ":" ;
                } else {
                    str[i][j] = ":fan:";
                }
            }
        }
        
        for(int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length; j++) {
                System.out.print(str[i][j]);
            }
            System.out.println();
        }
        
    }
}