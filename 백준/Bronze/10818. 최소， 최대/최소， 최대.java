
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] A = new int [N];
        for(int i = 0; i < N; i++){
            A[i]=sc.nextInt();
        }

        int Max = A[0];
        int Min = A[0];

        for(int i = 0; i < N; i++){
            if(A[i] < Min){
                Min = A[i];
            }
            if(A[i] > Max){
                Max = A[i];
            }
        }

        System.out.print(Min + " " + Max);
    }
}
