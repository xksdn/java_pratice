import java.util.Scanner;

class Printer {
    private int numOfPaper = 0; // 용지의 수를 저장하는 변수

    // 용지의 수를 반환하는 메서드
    public int getNumOfPaper() {
        return numOfPaper;
    }

    // 용지의 수를 설정하는 메서드
    public void setNumOfPaper(int numOfPaper) {
        this.numOfPaper = numOfPaper;
    }

    // 용지를 출력하는 메서드
    public void print(int amount) {
        if (numOfPaper >= amount) {
            System.out.println(getNumOfPaper() - amount + "장 남았습니다.");
        } else {
            System.out.println("용지가 부족합니다.");
        }
    }
}

public class PrinterTest {
    public static void main(String[] args) {
        Printer paper = new Printer(); // Printer 클래스의 객체를 생성

        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 용지의 수를 입력받아 설정
        System.out.print("용지를 추가해주세요 : ");
        paper.setNumOfPaper(scanner.nextInt());

        // 사용자로부터 출력할 양을 입력받아 프린터에서 출력
        System.out.print("몇 장을 출력하시겠어요? : ");
        paper.print(scanner.nextInt());
    }
}
