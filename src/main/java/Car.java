import java.util.Objects;

public class Car extends Vehicle {
    private int numberOfDoors;

    public Car() {
    }

    public Car(String manufacturer, String model, int yearManufactured, int numberOfDoors) {
        super(manufacturer, model, yearManufactured);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void showInformation() {
        super.showInformation();
        System.out.println("Number of Doors: " + numberOfDoors);
    }

    // getters and setters
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    //equals and hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return numberOfDoors == car.numberOfDoors;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfDoors);
    }

    //toString
    @Override
    public String toString() {
        return "Car{" +
                "numberOfDoors=" + numberOfDoors +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", yearManufactured=" + yearManufactured +
                '}';
    }
}
