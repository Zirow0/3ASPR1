// Клас автомобіля
public class Car implements Runnable {
    private String name;
    private ParkingLot parkingLot;

    public Car(String name, ParkingLot parkingLot) {
        this.name = name;
        this.parkingLot = parkingLot;
    }

    @Override
    public void run() {
        parkingLot.park(name);
    }
}