import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));        String a = bf.readLine();
        int[] arr = new int[26];

        for (int i = 0; i < 26; i++) {
            arr[i] = -1;
        }

        for (int i = 0; i < a.length(); i++) {
            char b = a.charAt(i);
            if (arr[b - 'a'] == -1) { // 이걸 안 걸면 5가 아닌 6이 나옴
                arr[b - 'a'] = i;
            }
        }
        for (int result : arr) {
            System.out.print(result + " ");
        }
    }
}