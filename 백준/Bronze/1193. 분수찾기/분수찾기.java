import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(bf.readLine());

        int x = 1;
        int y = 1;
        int cnt = 0; // 몇개의 함수가 있는지
        int n = 0; // 몇번째 그룹인지

        if (N == 1) {
            System.out.println("1/1");
        } else {
            while (cnt < N) {
                n++;
                cnt = n * (n + 1) / 2;
            }
            int num = N - (n - 1) * n / 2;
            if (n % 2 == 0) {
                y = num;
                x = n - num + 1;
            } else {
                y = n - num + 1;
                x = num;
            }
            System.out.println(y + "/" + x);
        }
    }
}