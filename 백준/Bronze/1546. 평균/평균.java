import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;
        int score;
        double sum = 0;
        int max = 0;

            N = sc.nextInt();
        

        for (int i = 0; i < N; i++) {
            score = sc.nextInt();
            if (score > max) {
                max = score;
            }
            sum += score;
        }

        System.out.print(sum / max * 100 / N);

        sc.close();
    }
}