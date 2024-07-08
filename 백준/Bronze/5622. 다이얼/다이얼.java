import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        int a = str1.length();
        String[] str2 = new String[a];
        int sec = 0;

        for (int i = 0; i < a; i++) {
            str2[i] = String.valueOf(str1.charAt(i));
        }

        for (int i = 0; i < a; i++){
            if (str2[i].equals("A") || str2[i].equals("B") || str2[i].equals("C")) {
                sec += 3;
            }
            else if (str2[i].equals("D") || str2[i].equals("E") || str2[i].equals("F")) {
                sec += 4;
            }
            else if (str2[i].equals("G") || str2[i].equals("H") || str2[i].equals("I")) {
                sec += 5;
            }
            else if (str2[i].equals("J") || str2[i].equals("K") || str2[i].equals("L")) {
                sec += 6;
            }
            else if (str2[i].equals("M") || str2[i].equals("N") || str2[i].equals("O")) {
                sec += 7;
            }
            else if (str2[i].equals("P") || str2[i].equals("Q") || str2[i].equals("R") || str2[i].equals("S")) {
                sec += 8;
            }
            else if (str2[i].equals("T") || str2[i].equals("U") || str2[i].equals("V")) {
                sec += 9;
            }
            else if (str2[i].equals("W") || str2[i].equals("X") || str2[i].equals("Y") || str2[i].equals("Z")){
                sec += 10;
            }

        }
        System.out.println(sec);


    }
}