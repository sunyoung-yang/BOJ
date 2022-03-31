import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int A = Integer.parseInt(bf.readLine());

        int count = 0;

        for (int i = 0; i < A; i++) {
            st = new StringTokenizer(bf.readLine());
            String str = st.nextToken();

            boolean check[] = new boolean[26]; // 알파벳 사용 내역
            boolean tmp = true; // 그룹 단어 인지
            for (int j = 0; j < str.length(); j++) {
                if (check[str.charAt(j) - 97]) { // 이전에 사용되었던 문자라면?
                    if (str.charAt(j) != str.charAt(j - 1)) {
                        tmp = false;// 그룹단어 아냐
                        break;
                    }
                } else {

                    check[str.charAt(j) - 97] = true;
                }

            }
            if (tmp)
                count++;
        }
        System.out.println(count);

    }
}