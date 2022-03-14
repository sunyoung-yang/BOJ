import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int M = 0; // max

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (M < arr[i]) {
                M = arr[i];
            }
        }

        double sum = 0;
        double result = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = ((double)arr[i] / M) * 100;
            result += sum;
        }

        System.out.print(result / n);
        // bw.write(double+"\n");
        // bw.flush();
    }

}
