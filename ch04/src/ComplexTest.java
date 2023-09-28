class Complex {
    private double real; // 실수 부분
    private double imaginary; // 허수 부분

    public Complex(double real) {
        this.real = real;
        this.imaginary = 0.0; // 허수 부분은 0으로 초기화
    }

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void print() {
        if (imaginary >= 0) {
            System.out.println(real + " + " + imaginary + "i");
        } else {
            System.out.println(real + " - " + (-imaginary) + "i");
        }
    }
}

public class ComplexTest {
    public static void main(String[] args) {
        Complex c1 = new Complex(2.0);
        c1.print();

        Complex c2 = new Complex(1.5, 2.5);
        c2.print();
    }
}
