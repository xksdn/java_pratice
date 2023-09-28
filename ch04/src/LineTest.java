class Line {
    private double length; // 직선의 길이

    public Line(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public boolean isSameLine(Line other) {
        // 두 개의 Line 객체의 길이를 비교하여 동일한 직선을 나타내는지 확인
        return this.length == other.length;
    }
}


public class LineTest {
    public static void main(String[] args) {
        Line a = new Line(1);
        Line b = new Line(1);

        System.out.println(a.isSameLine(b));
        System.out.println(a == b);
    }
}
