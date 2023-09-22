public class FactorialTest {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    static int factorial(int n) {
        int result = 1;
        switch (n) {
            case 0:
            case 1:
                result = 1;
                break;
            default:
                for (int i = 2; i <= n; i++) {
                    result *= i;
                }
        }
        return result;
    }
}
