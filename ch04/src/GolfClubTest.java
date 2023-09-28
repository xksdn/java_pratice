class GolfClub {
    int num;
    String name;

    public GolfClub() {
        this.num = 7;   // 기본 생성자에서 num 속성을 7로 초기화
    }

    public GolfClub(int num) {
        this.num = num;
    }

    public GolfClub(String name) {
        this.name = name;
    }

    public void print() {
        if (num != 0) {
            System.out.println(num + "번 아이언입니다.");
        }
        if (name != null) {
            System.out.println(name + "입니다.");
        }
    }
}

public class GolfClubTest {
    public static void main(String[] args) {
        GolfClub g1 = new GolfClub();
        g1.print();

        GolfClub g2 = new GolfClub(8);
        g2.print();

        GolfClub g3 = new GolfClub("피터");
        g3.print();
    }
}
