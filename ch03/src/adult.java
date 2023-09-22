import java.util.Scanner;

public class adult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("나이를 입력해주세요 : ");
        int age = sc.nextInt();

        if (age >= 19) {
            System.out.println("성년입니다.");
        } else {
            System.out.println("미성년입니다.");
        }
    }
}