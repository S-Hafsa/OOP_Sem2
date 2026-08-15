public class Main {

    public static void main(String[] args) {

        Car bmw = new Car();
        System.out.println("Object Count: " + Car.getObjectCount());
        Car tesla = new Car();
        System.out.println("Object Count: " + Car.getObjectCount());

        bmw.setDetails("BMW", "Black");
        tesla.setDetails("Tesla", "Red");

        bmw.startEngine();
        bmw.drive();
        bmw.moveFast();
        bmw.moveRight();
        bmw.turboMode();

        tesla.startEngine();
        tesla.moveSlow();
        tesla.moveLeft();
        tesla.turnHeadlightsOn();

        bmw.displayState();
        tesla.displayState();

        bmw.stopEngine();
        bmw.displayState();
    }
}