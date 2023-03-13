package static_property;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("nguyen minh quan","40 tuoi");
        System.out.println(car1.getName());
        Car car2 = new Car("mai anh khoa","20 tuoi");
        System.out.println(car2.getEngine());
        System.out.println(Car.numberofCars);
    }
}
