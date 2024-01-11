public class lab2 {
    public static void main(String[] args) {
        Library lib = new Library("им.Ленина", "Москва, ул. Воздвиженка, 3/5", "9.00 - 20.00", 47000000);
        Shop shop = new Shop("Перекресток", "Москва, ул. Щукинская, 42", "8.00 - 23.00", "Продуктовый");
        Cafe cafe = new Cafe("KFC", "Москва, ул. Народного Ополчения, 46", "6.00-4.00", 60, 5);

        System.out.println("Библиотека " + lib.getName());
        System.out.println("Адрес: " + lib.getLocation());
        System.out.println("Время работы: " + lib.getWorktime());
        System.out.println("Кол-во книг: " + lib.getNumOfBook());
        System.out.println("--------------------------");
        System.out.println("Название: " + shop.getName());
        System.out.println("Адрес: " + shop.getLocation());
        System.out.println("Время работы: " + shop.getWorktime());
        System.out.println("Тип магазина: " + shop.getCategory());
        System.out.println("--------------------------");
        System.out.println("Название: " + cafe.getName());
        System.out.println("Адрес: " + cafe.getLocation());
        System.out.println("Время работы: " + cafe.getWorktime());
        System.out.println("Вместимость: " + cafe.getCapacityForPeople());
        System.out.println("Рейтинг заведения: " + cafe.getRating());
        System.out.println("--------------------------");

        lib.open();
        lib.close();
        lib.visitorPerDay(785);
        System.out.println("--------------------------");
        shop.open();
        shop.close();
        shop.revenue(273000);
        System.out.println("--------------------------");
        cafe.open();
        cafe.close();
        cafe.queue(13);
        System.out.println("--------------------------");
        System.out.println("Создано объектов: " + Library.getObjectCount());


    }
}
abstract class Establishment {
    protected String name;
    protected String location;
    protected String worktime;

    private static int objectCounter = 0;

    public Establishment() {
        objectCounter++;
    }

    public Establishment(String name, String location, String worktime) {
        this.name = name;
        this.location = location;
        this.worktime = worktime;
        objectCounter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getWorktime() {
        return worktime;
    }

    public void setWorktime(String worktime) {
        this.worktime = worktime;
    }

    public abstract void open();
    public abstract void close();

    public static int getObjectCount() {
        return objectCounter;
    }
}

class Library extends Establishment {
    private int numOfBook;

    public Library(String name, String location, String worktime, int numOfBook) {
        super(name, location, worktime);
        this.numOfBook = numOfBook;
    }

    public int getNumOfBook() {
        return numOfBook;
    }

    public void setNumOfBook(int numOfBook) {
        this.numOfBook = numOfBook;
    }
    @Override
    public void open() {
        System.out.println("Библиотека " + getName() + " открыта");
    }
    @Override
    public void close() {
        System.out.println("Библиотека " + getName() + " закрыта");
    }
    public void visitorPerDay(int people) {
        System.out.println("Посетителей за день: " + people);
    }
}

class Shop extends Establishment {
    private String category;

    public Shop(String name, String location, String worktime, String category) {
        super(name, location, worktime);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    @Override
    public void open() {
        System.out.println("Магазин открыт");
    }
    @Override
    public void close() {
        System.out.println("Магазин закрыт");
    }
    public void revenue(int money) {
        System.out.println("Выручка магазина " + getName() + " за день: " + money + " руб.");
    }
}

class Cafe extends Establishment {
    private int capacityForPeople;
    private int rating;

    public Cafe(String name, String location, String worktime, int capacityForPeople, int rating) {
        super(name, location, worktime);
        this.capacityForPeople = capacityForPeople;
        this.rating = rating;
    }

    public int getCapacityForPeople() {
        return capacityForPeople;
    }
    public void setCapacityForPeople(int capacityForPeople) {
        this.capacityForPeople = capacityForPeople;
    }

    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }
    @Override
    public void open() {
        System.out.println("Кафе открыто");
    }
    @Override
    public void close() {
        System.out.println("Кафе закрыто");
    }
    public void queue(int people) {
        System.out.println("Перед вами в очереди " + people + " человек");
    }
}