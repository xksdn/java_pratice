import java.util.Scanner;

public class ranking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("몇 등이신가요?");
        int rank = sc.nextInt();

//        if (rank == 1) {
//            System.out.println("아주 잘했습니다.");
//        } else if (rank <= 3) {
//            System.out.println("잘했습니다.");
//        } else if (rank <= 6) {
//            System.out.println("보통입니다.");
//        } else {
//            System.out.println("노력해야겠습니다.");
//        }

        switch (rank) {
            case 1:
                System.out.println("아주 잘했습니다.");
                break;

            case 2:
            case 3:
                System.out.println("잘했습니다.");
                break;

            case 4:
            case 5:
            case 6:
                System.out.println("보통입니다.");
                break;

            default:
                System.out.println("노력해야겠습니다.");
        }

    }
}