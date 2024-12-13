public class Main {
    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot();

        // Створюємо потоки для кожного автомобіля
        String[] carNames = {"А1", "А2", "А3", "А4", "А5", "А6", "А7", "А8", "А9", "А10", "А11", "А12", "А13", "А14", "А15"};

        Thread[] threads = new Thread[carNames.length];

        for (int i = 0; i < carNames.length; i++) {
            threads[i] = new Thread(new Car(carNames[i], parkingLot));
            threads[i].start();
        }

        // Очікуємо завершення всіх потоків
        for (int i = 0; i < threads.length; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                System.err.println("Помилка під час очікування: " + e.getMessage());
            }
        }

    }
}