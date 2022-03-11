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
        // StringTokenizer st = new StringTokenizer(bf.readLine()); 를 먼저 입력하면 arr[i] 입력시 string으로 인식이 된다. 
        //걍 공백으로 구분되는 문장 바로 전에 무조건 StringTokenizer선언해라
        // a 입력 후 입력을 읽고, st 객체를 생성하여 arr[i] 읽는다.
        int a = Integer.parseInt(bf.readLine());

        st = new StringTokenizer(bf.readLine());
        int[] arr = new int[a];

        for (int i = 0; i < a; i++) {

            arr[i] = Integer.parseInt(st.nextToken());
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < a; i++) {
            if (max < arr[i])
                max = arr[i];
            if (min > arr[i])
                min = arr[i];
        }
        bw.write(min + " " + max);
        bw.flush();

    }

}
