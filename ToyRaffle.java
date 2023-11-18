public class ToyRaffle {
    public static void main(String[] args) {
        ToyStore store = new ToyStore();

        Toy toy1 = new Toy(1, "Конструктор LEGO Technic", 10, 20);
        Toy toy2 = new Toy(2, "Трансформер 'Оптимус Прайм'", 200, 40);
        Toy toy3 = new Toy(3, "Футбольный мяч Adidas", 200, 90);
        Toy toy4 = new Toy(3, "Набор игровой Barbie", 50, 30);
        Toy toy5 = new Toy(3, "Пазл 33600", 200, 90);
        Toy toy6 = new Toy(3, "Робот 'Дружок'", 10, 10);

        store.addToy(toy1);
        store.addToy(toy2);
        store.addToy(toy3);
        store.addToy(toy4);
        store.addToy(toy5);
        store.addToy(toy6);


        store.changeToyFrequency(1, 30);

        store.organizeRaffle();

        Toy prizeToy = store.getPrizeToy();
        if (prizeToy != null) {
            System.out.println("Выигрышная игрушка: " + prizeToy.getName());
        }
    }
}