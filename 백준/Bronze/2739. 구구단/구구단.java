import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 시
        sc.close();

        for (int j = 1; j <= 9; j++) {
            System.out.println(N + " * " + j + " = " + N * j);
        }

    }
}