import java.time.Year;

public class Car {
    String brand;
    String model;
    String licensePlate;
    String color;
    double buyPrice;
    int constructionYear;

    int getAge() {
        return Year.now().getValue() - constructionYear;
    }

    double getCurrentPrice() {
        return Math.max(0, buyPrice * (1 - getAge() * 0.1));
    }

    boolean equals(Car car) {
        return licensePlate.equals(car.licensePlate);
    }
}
