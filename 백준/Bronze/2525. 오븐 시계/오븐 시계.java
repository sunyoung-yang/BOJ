import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 시
        int b = sc.nextInt(); // 분
        int c = sc.nextInt();
        sc.close();

        b += c;

        while (b > 59) {
            a++;
            b = b - 60;
            if (a == 24) {
                a = 0;
            }
        }
        System.out.print(a + " " + b);
    }
}