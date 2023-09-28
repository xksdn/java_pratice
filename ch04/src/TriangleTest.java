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
}

public class TriangleTest {
    public static void main(String[] args) {
        Triangle t = new Triangle(10.0, 5.0);
        System.out.println("삼각형의 넓이: " + t.findArea());
    }
}
