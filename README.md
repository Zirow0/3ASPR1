### **Пояснення алгоритму та функціоналу**

Ця програма симулює процес паркування  автомобілів на обмежену кількість паркувальних місць.

1. **Головний клас `Main`**:
    - Створює об'єкт паркувального майданчика (`ParkingLot`) для управління паркувальними місцями.
    - Створює потоки для кожного автомобіля (`Car`) та запускає їх.
    - Чекає, поки всі потоки завершаться.

2. **Клас `Car`**:
    - Симулює кожен автомобіль як окремий потік.
    - Спробує зайняти місце на паркуванні через метод `park()`.

3. **Клас `ParkingLot`**:
    - **Семафор**: Обмежує кількість автомобілів на парковці.
    - **Динамічне визначення кількості місць**: 5 місць вдень, 8 — вночі.
    - **Метод `park()`**: Автомобіль займає місце, паркується протягом 3 секунд, після чого звільняє місце.

---

### **Ключові елементи**
1. **Семафори (`Semaphore`)** — обмежують кількість автомобілів на парковці.
2. **Потоки (`Thread`) з інтерфейсом `Runnable`** — кожен автомобіль працює паралельно.
3. **Динамічне регулювання місць** — кількість місць змінюється залежно від часу доби (день/ніч).

---

### **Що відбувається?**
1. **Вдень**: 5 місць доступно для паркування.
2. **Вночі**: 8 місць доступно.
3. Кожен автомобіль намагається зайняти місце, паркується протягом 3 секунд, а потім звільняє місце.
4. Семафор забезпечує, щоб одночасно не паркувалося більше дозволеної кількості автомобілів.
