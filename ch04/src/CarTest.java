class Car {
    private static int numOfCar = 0;      // 전체 자동차 수
    private static int numOfRedCar = 0;   // 빨간색 자동차 수

    public static int getNumOfCar() {
        return numOfCar;
    }

    public static int getNumOfRedCar() {
        return numOfRedCar;
    }

    private String color; // 자동차의 색상

    public Car(String color) {
        this.color = color;
        numOfCar++; // 자동차 수 증가
        if (color.equalsIgnoreCase("red")) {
            numOfRedCar++; // 빨간색 자동차 수 증가
        }
    }
}


public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car("red");
        Car c2 = new Car("blue");
        Car c3 = new Car("RED");

        System.out.printf("자동차 수 : %d, 빨간색 자동차 수 : %d", Car.getNumOfCar(), Car.getNumOfRedCar());
    }
}

