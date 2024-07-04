public class Main {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle();
        Car myCar = new Car("Mazda", "2", 2009, 5);

        System.out.println(myVehicle);
        System.out.println(myCar);

        myCar.showInformation();
        myVehicle.showInformation();

    }
}
