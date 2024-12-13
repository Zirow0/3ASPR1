import java.util.concurrent.Semaphore;
import java.time.LocalTime;

public class ParkingLot {
    private Semaphore parkingSpaces;

    public ParkingLot() {
        this.parkingSpaces = new Semaphore(getAvailableSpaces(), true);
    }

    // Метод для визначення кількості паркувальних місць залежно від часу
    private int getAvailableSpaces() {
        LocalTime now = LocalTime.now();
        return (now.getHour() >= 6 && now.getHour() < 21) ? 5 : 8;
    }


    // Спроба зайняти місце на парковці
    public void park(String carName) {
        try {
            parkingSpaces.acquire(); // Займаємо місце
            System.out.println(carName + " зайняв місце на паркуванні.");
            Thread.sleep(3000); // Симуляція часу паркування
            System.out.println("\t" + carName + " покидає місце на паркуванні.");
            parkingSpaces.release(); // Звільняємо місце
        } catch (InterruptedException e) {
            System.err.println("Помилка для " + carName + ": " + e.getMessage());
        }
    }
}