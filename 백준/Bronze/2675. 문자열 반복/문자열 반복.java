import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.security.KeyFactory;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(bf.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(bf.readLine());
            int R = Integer.parseInt(st.nextToken());
            char[] arr = st.nextToken().toCharArray();

            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < R; k++) {
                    System.out.print(arr[j]);
                }
            }
            System.out.println();
        }
    }
}
