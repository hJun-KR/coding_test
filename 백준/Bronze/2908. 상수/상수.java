import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        String[] str3 = new String[3];
        String[] str4 = new String[3];

        for(int i = 0; i < str3.length; i++) {
            str3[i] = String.valueOf(str1.charAt(i));
        }
        String temp = str3[0];
        str3[0] = str3[2];
        str3[2] = temp;

        for(int i = 0; i < str4.length; i++) {
            str4[i] = String.valueOf(str2.charAt(i));
        }
        temp = str4[0];
        str4[0] = str4[2];
        str4[2] = temp;

        str1 = str3[0] + str3[1] + str3[2];
        str2 = str4[0] + str4[1] + str4[2];
        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);

        if(num1 > num2) {
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }

    }
}