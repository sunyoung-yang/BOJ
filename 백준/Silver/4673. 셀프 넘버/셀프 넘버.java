public class Main {

    public static void main(String[] args) {

        boolean[] a = new boolean[10001];

        for (int i = 1; i < 10001; i++) {
            int n = d(i);

            if (n < 10001) { // 10000보다 작은 수만
                a[n] = true;
            }
        }
        for (int i = 1; i < 10001; i++) { // 1부터10000까지 돌려서 false만 출력
            if (a[i] == false) {// ==는 관계비교연산자
                System.out.println(i);
            }
        }
    }

    public static int d(int number) {
        int sum = number;
        while (number > 0) {
            sum += number % 10;
            number = number / 10;
        }
        return sum;
    }

}
