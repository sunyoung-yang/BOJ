import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String T = bf.readLine();
        int[] str = new int[26];

        for (int i = 0; i < T.length(); i++) {
            if (T.charAt(i) >= 'a' && T.charAt(i) <= 'z') {
                str[T.charAt(i) - 97]++;// 소문자
            } else {
                str[T.charAt(i) - 65]++; // 대문자
            }
        }

        int max = -1;
        char ch = '?';
        for (int i = 0; i < 26; i++) {
            if (str[i] > max) {
                max = str[i];
                ch = (char) (i + 65);// 대문자로 나타내기 위해
            } else if (str[i] == max) {
                ch = '?';
            }
        }
        System.out.println(ch);
    }
}
