public class Main {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle();
        Car myCar = new Car("Mazda", "2", 2009, 5);
        Motorcycle myMotorcycle = new Motorcycle("Harley Davidson", "Mirror", 2017, "Cruiser");

        myMotorcycle.showInformation();

        myCar.showInformation();
        System.out.println(myCar);

        myVehicle.showInformation();
        System.out.println(myVehicle);

    }
}
