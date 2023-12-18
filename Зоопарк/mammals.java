// Пакет "mammals"
package animals.mammals;

// Класс для млекопитающих
public abstract class Mammal extends AnimalBase {
    public Mammal(String name, int age) {
        super(name, age);
    }

    public abstract void giveBirth();  // Абстрактный метод для потомства
}

