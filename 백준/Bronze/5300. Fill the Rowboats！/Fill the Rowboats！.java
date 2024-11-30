import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            System.out.print((i+1)+" ");
            if((i+1)%6==0 || i==n-1){
                System.out.print("Go! ");
            }
        }
    }
}