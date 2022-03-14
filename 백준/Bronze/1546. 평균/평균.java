import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt(); // 과목의 수
        double[] subject = new double[count]; // 과목별 점수
        int max = 0; // 과목 최대 점수
        double sum = 0; // 점수의 합

        // 과목 별로 점수를 입력 받고, 최대 점수를 구함
        for (int i = 0; i < count; i++) {
            subject[i] = sc.nextFloat();
            max = (int) Math.max(max, subject[i]);
        }

        // 점수 조작
        for (int i = 0; i < count; i++) {
            subject[i] = (double) subject[i] / max * 100;
            sum += subject[i];
        }

        // 조작된 점수의 평균 출력
        System.out.println(sum / count);
    }

}
