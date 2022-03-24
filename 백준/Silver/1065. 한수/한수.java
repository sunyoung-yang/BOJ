import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bf.readLine());

        System.out.println(result(a));
    }

    public static int result(int number) {

        int count = 0;

        for (int i = 1; i <= number; i++) {
            int num1 = i % 10; // 첫째자리
            int num2 = (i / 10) % 10; // 둘째자리
            int num3 = (i % 1000) / 100; // 셋째 자리

            if (i < 100) {
                count++;
            } else if ((num1 - num2) == (num2 - num3)) {
                count++;
            }
            if (i == 1000) {
                count--;
            }
        }
        return count;
    }

}
