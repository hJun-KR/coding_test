import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] arr = new String[str.length()];

        for (int i = 0; i < str.length(); i++) {
            arr[i] = String.valueOf(str.charAt(i));
        }
        if (arr.length == 1) {
            System.out.println("1");
            return;
        }
        int start = 0;
        int end = arr.length-1;
        int last = arr.length-2;
        while (true) {
            if (arr[start].equals(arr[end])) {
                if (start == last) {
                    System.out.println("1");
                    break;
                }
                start++;
                end--;
            } else {
                System.out.println("0");
                break;
            }
        }
        
    }
}