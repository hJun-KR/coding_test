import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[][] board = {{"11", "A B C D E F G H J L M"},
                    {"9", "A C E F G H I L M"},
                    {"9", "A C E F G H I L M"},
                    {"9", "A B C E F G H L M"},
                    {"8", "A C E F G H L M"},
                    {"8", "A C E F G H L M"},
                    {"8", "A C E F G H L M"},
                    {"8", "A C E F G H L M"},
                    {"8", "A C E F G H L M"},
                    {"8", "A B C F G H L M"}};
        
        int n = sc.nextInt();
        System.out.println(board[n-1][0]);
        System.out.println(board[n-1][1]);
        
    }
}