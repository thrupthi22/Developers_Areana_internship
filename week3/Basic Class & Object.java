public class Car {
    String brand;
    int speed;

    public void showDetails() {
        System.out.println("Brand: " + brand + ", Speed: " + speed);
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.brand = "Tesla";
        c.speed = 120;
        c.showDetails();
    }
}
