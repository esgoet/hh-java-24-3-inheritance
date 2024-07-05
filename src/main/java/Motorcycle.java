public class Motorcycle extends Vehicle {
    private String type;

    public Motorcycle() {
    }

    public Motorcycle(String manufacturer, String model, int yearManufactured, String type) {
        super(manufacturer, model, yearManufactured);
        this.type = type;
    }

    public void showInformation() {
        super.showInformation();
        System.out.println("Type: " + type);
    }
}
