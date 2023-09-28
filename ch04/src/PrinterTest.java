import java.util.Scanner;

class Printer {
    private int numOfPaper = 0; // 용지의 수를 저장하는 변수
    private boolean duplex; // 양면 여부를 확인하는 변수

    public boolean getDuplex() {
        return duplex;
    }

    public void setDuplex(boolean duplex) {
        this.duplex = duplex;
    }

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
        if (numOfPaper == 0) {
            System.out.println("용지가 없습니다.");
        } else if (numOfPaper < amount) {
            System.out.println(amount + "장 출력합니다. " + (amount - numOfPaper) + "장 부족합니다.");
            numOfPaper -= amount;
        } else {
            // 요청한 양만큼 출력하고 남은 용지 수를 표시
            System.out.println(amount + "장 출력하였습니다. 남은 용지 수: " + (numOfPaper - amount) + "장");
            numOfPaper -= amount; // 출력한 용지 수만큼 감소
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


        while (paper.getNumOfPaper() > 0) {
            // 사용자로부터 출력할 양을 입력받아 프린터에서 출력
            System.out.print("몇 장을 출력하시겠어요? : ");
            int printAmount = scanner.nextInt();
            paper.print(printAmount);

            // 남은 용지 수를 출력
            if (paper.getNumOfPaper() > 0) {
                System.out.println("남은 용지 수: " + paper.getNumOfPaper() + "장");
            } else {
                System.out.println("남은 용지가 없습니다.");
            }
        }
    }
}
