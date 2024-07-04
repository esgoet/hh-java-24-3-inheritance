import java.util.Objects;

public class Vehicle {
    protected String manufacturer;
    protected String model;
    protected int yearManufactured;

    //constructors
    public Vehicle() {

    }

    public Vehicle(String manufacturer, String model, int yearManufactured) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.yearManufactured = yearManufactured;
    }

    public void showInformation() {
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Model: " + model);
        System.out.println("Year Manufactured: " + yearManufactured);
    }

    // getters and setters
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearManufactured() {
        return yearManufactured;
    }

    public void setYearManufactured(int yearManufactured) {
        this.yearManufactured = yearManufactured;
    }

    // equals and hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return yearManufactured == vehicle.yearManufactured && Objects.equals(manufacturer, vehicle.manufacturer) && Objects.equals(model, vehicle.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, model, yearManufactured);
    }

    // toString
    @Override
    public String toString() {
        return "Vehicle{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", yearManufactured=" + yearManufactured +
                '}';
    }
}
