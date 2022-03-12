import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int a = Integer.parseInt(bf.readLine())
                * Integer.parseInt(bf.readLine())
                * Integer.parseInt(bf.readLine());

        String result = String.valueOf(a);
        int[] list = new int[10];

        // charAt()을 쓸 경우 - '0' 또는 -48 을 해주어야 한다.
        // 아스키코드에 대응하는 문자가 나올 수 있기 때문이다.
        for (int i = 0; i < result.length(); i++) {
            list[(result.charAt(i) - '0')]++;
        }

        for (int arr : list) {
            bw.write(arr + "\n");
        }

        bw.flush();

    }

}
