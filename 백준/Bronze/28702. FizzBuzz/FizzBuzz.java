import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] str = new String[3];

        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }

        if (str[2].charAt(0) > '0' && str[2].charAt(0) <= '9') {
            int num = Integer.parseInt(str[2]) + 1;
            FizzBuzzCheck(num);
        } else if (str[1].charAt(0) > '0' && str[1].charAt(0) <= '9') {
            int num = Integer.parseInt(str[1]) + 2;
            FizzBuzzCheck(num);
        } else if (str[0].charAt(0) > '0' && str[0].charAt(0) <= '9') {
            int num = Integer.parseInt(str[0]) + 3;
            FizzBuzzCheck(num);
        } else {
            System.out.println("숫자가 아닙니다.");
        }
    }
    public static void FizzBuzzCheck(int num) {
        if(num % 3 == 0 && num % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (num % 3 == 0) {
            System.out.println("Fizz");
        } else if (num % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(num);
        }
    }
}
