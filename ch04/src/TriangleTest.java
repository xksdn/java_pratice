class Triangle {
    private double side = 0;
    private double high = 0;

    public Triangle(double side, double high) {
        this.side = side;
        this.high = high;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double findArea() {
        // 삼각형의 넓이 계산
        double area = (side * high) / 2;
        return area;
    }

    public boolean isSameArea(Triangle other) {
        // 다른 삼각형과 넓이를 비교
        return this.findArea() == other.findArea();
    }
}

public class TriangleTest {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(10.0, 5.0);
        Triangle t2 = new Triangle(5.0, 10.0);
        Triangle t3 = new Triangle(8.0, 8.0);

        System.out.println(t1.isSameArea(t2));
        System.out.println(t1.isSameArea(t3));
    }
}
