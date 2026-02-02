import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;
        int score;
        double sum = 0;
        int max = 0;

        // 과목 개수 입력
        if (sc.hasNextInt()) {
            N = sc.nextInt();
        } else {
            return;
        }

        // 점수 입력 및 최댓값, 총합 구하기
        for (int i = 0; i < N; i++) {
            score = sc.nextInt();
            if (score > max) {
                max = score;
            }
            sum += score;
        }

        // 새로운 평균 계산: (총합 / 최댓값 * 100) / 과목수
        // sum이 double이므로 전체 연산은 실수로 진행됩니다.
        System.out.print(sum / max * 100 / N);

        sc.close();
    }
}