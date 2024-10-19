import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int input = sc.nextInt();;
        
        while (input != 0) {
            String str = "";
            String str2 = "";
            str2 = Integer.toString(input);
            
            int leng = str2.length();
            int[] arr = new int[leng];
            
            for (int i = 0; i < leng; i++){
                char ch = str2.charAt(i);
                arr[i] = ch-48;
            }   

            for (int i = leng-1; i >= 0; i--) {
                str += arr[i];
            }

            if (str2.equals(str)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
            
            input = sc.nextInt();
        }
        
    }
}