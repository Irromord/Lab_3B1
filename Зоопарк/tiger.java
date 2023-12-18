// Класс для тигров
public class Tiger extends Mammal {
    public Tiger(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Roar!");  // Реализация метода "makeSound" для тигров
    }

    @Override
    public void giveBirth() {
        System.out.println(name + " gives birth to cubs.");  // Реализация метода "giveBirth" для тигров
    }
}
