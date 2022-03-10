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
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int count = 0;

        int a = Integer.parseInt(st.nextToken());
        int newnum = a;

        do {
            a = ((a % 10) * 10) + (((a / 10) + (a % 10)) % 10);
            count++;

        } while (newnum != a);

        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }

}
