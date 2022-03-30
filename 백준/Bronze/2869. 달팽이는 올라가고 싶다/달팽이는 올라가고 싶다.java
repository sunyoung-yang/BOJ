import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        /*
        int sum = 0;
        int count = 0;

        while (true) {
            sum += A;
            count++;
            if (sum >= C) {
                System.out.println(count);
                break;
            }
            sum -= B;

        }*/
        int total = (C-B)/(A-B);
        if(((C-B)%(A-B))!=0){
            total++;
        }
        System.out.println(total);
    }
}