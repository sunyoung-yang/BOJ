import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        // int a = Integer.parseInt(bf.readLine());
        int[] arr = new int[9];

        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(bf.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int max = 0;
        int count = 0;

        for (int i = 0; i < 9; i++) {

            if (arr[i] > max) {
                max = arr[i];
                count = i + 1;
            }

        }

        bw.write(max + "\n" + count);
        bw.flush();

    }

}
