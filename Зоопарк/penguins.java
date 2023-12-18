// Класс для пингвинов
public class Penguin extends Bird {
    public Penguin(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Hoot!");  // Реализация метода "makeSound" для пингвинов
    }

    @Override
    public void layEggs() {
        System.out.println(name + " lays eggs.");  // Реализация метода "layEggs" для пингвинов
    }
}