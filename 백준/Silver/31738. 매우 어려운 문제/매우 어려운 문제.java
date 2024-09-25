import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());
        long result = 1;
        
        if (m <= n) { 
            result = 0;
        } else {
            for (long i = n; i > 0; i--) {
                result *= i;
                result %= m;
                
                if (result == 0) {
                    break;
                }
            }
        }
        
        bw.write(Long.toString(result));
        bw.flush();
        bw.close();
        br.close();
    }
}
