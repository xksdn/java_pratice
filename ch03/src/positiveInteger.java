import java.util.Scanner;

public class positiveInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, sum = 0;

        do {
            System.out.print("양의 정수를 입력하세요 : ");
            num = sc.nextInt();

            if (num <= 0) {
                break;  // 입력 종료
            }

            if (num % 2 == 0) {
                sum += num;
            }
        } while (true);

        System.out.println("입력된 짝수의 합: " + sum);
    }
}
