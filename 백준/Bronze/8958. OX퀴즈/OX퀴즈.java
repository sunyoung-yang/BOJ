import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int A = Integer.parseInt(br.readLine());
        String[] arr = new String[A];

        for (int i = 0; i < A; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = (st.nextToken());

        }

        for (int j = 0; j < arr.length; j++) {
            int cnt = 0; //하나 지나면 0으로 리셋해야 하니까
            int sum = 0;

            for (int i = 0; i < arr[j].length(); i++) {
                if (arr[j].charAt(i) == 'O') {
                    cnt++;
                    sum += cnt;
                } else {
                    cnt = 0;
                }

            }
            System.out.println(sum);
        }

    }
}
