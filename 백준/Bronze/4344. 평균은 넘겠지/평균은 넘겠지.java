import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int c = Integer.parseInt(br.readLine());
        int[] arr;

        for (int i = 0; i < c; i++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            arr = new int[N];

            int sum = 0;

            for (int j = 0; j < N; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
                sum += arr[j];
            }
            double avg = 0;
            double count = 0;

            for (int j = 0; j < N; j++) {

                avg = sum / N;
                if (arr[j] > avg) {
                    count++;
                }

            }
            
            System.out.printf("%.3f%%\n", (count / N) * 100);


        }
        
    }
}
