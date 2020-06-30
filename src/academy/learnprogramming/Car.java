package academy.learnprogramming;

//Create a Car object named myCar. Call the fullThrottle() and speed() methods on the myCar object, and run
public class Car {

    String carName;
    private String newCarName;

    public Car(String c1){
        carName = c1;
        newCarName = "Suzuki";
    }

    public static void main(String[] args){
        Car carObj = new Car("Audi");
        carObj.fullThrottle();
        carObj.speed(60);
        Car.maxSpeed(200);
        System.out.println("Default carName is " + carObj.carName);
        System.out.printf("newCarName carName is %s%n", carObj.newCarName);
        carObj.carName = "Toyota";
        System.out.println("Updated carName is " + carObj.carName);
    }

    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }

    public void speed(int speed) {
        System.out.println("Car speed is " + speed + "km/hr");
    }

    static void maxSpeed(int speed) {
        System.out.println("Max speed of car is " + speed + "km/hr");
    }
}
