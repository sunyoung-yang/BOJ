import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        HashSet<Integer> list = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            st = new StringTokenizer(bf.readLine());
            list.add((Integer.parseInt(st.nextToken())) % 42);
        }

        System.out.println(list.size());
        //bw.write(list.size() + "\n");
        //bw.flush();

    }

}
