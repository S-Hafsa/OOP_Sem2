public class Car {

    private String brand;
    private String color;
    private int speed;
    private boolean engineOn;

    // New attributes
    private int fuelLevel;
    private boolean headlightsOn;
    private double angle;
    private static int objectCount = 0;

    public Car() {
        this.brand = "Unknown";
        this.color = "White";
        this.speed = 0;
        this.engineOn = false;
        this.fuelLevel = 100;
        this.headlightsOn = false;
        this.angle = 0.0;
        Car.objectCount++;
    }

    public Car(String brand, String color, int speed, boolean engineOn, int fuelLevel, boolean headlightsOn,
            double angle) {
        this.brand = brand;
        this.color = color;
        this.speed = speed;
        this.engineOn = engineOn;
        this.fuelLevel = fuelLevel;
        this.headlightsOn = headlightsOn;
        this.angle = angle;
        Car.objectCount++;
    }

    public void setDetails(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public void startEngine() {
        engineOn = true;
        System.out.println(brand + " Engine Started");
    }

    public void stopEngine() {
        speed = 0;
        engineOn = false;
        System.out.println(brand + " Engine Stopped");
    }

    public void drive() {
        if (engineOn && fuelLevel >= 5) {
            speed = 40;
            fuelLevel -= 5;
            System.out.println(brand + " is driving at speed " + speed);
        } else {
            System.out.println("Start engine first or not enough fuel.");
        }
    }

    public void moveFast() {
        if (engineOn && fuelLevel >= 10) {
            speed = 100;
            fuelLevel -= 10;
            System.out.println(brand + " is moving fast at speed " + speed);
        } else {
            System.out.println("Not enough fuel or engine not started.");
        }
    }

    public void moveSlow() {
        if (engineOn && fuelLevel >= 2) {
            speed = 20;
            fuelLevel -= 2;
            System.out.println(brand + " is moving slowly at speed " + speed);
        } else {
            System.out.println("Not enough fuel or engine not started.");
        }
    }

    public void moveLeft() {
        angle -= 90;
        System.out.println(brand + " turned left with angle " + angle);
    }

    public void moveRight() {
        angle += 90;
        System.out.println(brand + " turned right. with angle " + angle);
    }

    public void turboMode() {
        if (engineOn && fuelLevel >= 20) {
            speed += 50;
            fuelLevel -= 20;
            System.out.println("Turbo Mode Activated!");
        } else {
            System.out.println("Not enough fuel or engine not started.");
        }
    }

    public void turnHeadlightsOn() {
        headlightsOn = true;
        System.out.println(brand + " headlights turned on.");
    }

    public static int getObjectCount() {
        return objectCount;
    }

    public void displayState() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed);
        System.out.println("Fuel: " + fuelLevel);
        System.out.println("Engine: " + engineOn);
        System.out.println("Headlights on: " + headlightsOn);
        System.out.println("Angle: " + angle);
        System.out.println("Object Count: " + Car.objectCount);
    }
}