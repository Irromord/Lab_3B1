// Пакет "zoo"
package zoo;

import animals.Animal;

import java.util.ArrayList;
import java.util.List;

// Класс для зоопарка
public class Zoo {
    private List<Animal> animals;

    public Zoo() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);  // Добавление животного в зоопарк
    }

    public void feedAnimals() {
        for (Animal animal : animals) {
            animal.eat();  // Кормление всех животных в зоопарке
        }
    }

    public void makeAnimalsSleep() {
        for (Animal animal : animals) {
            animal.sleep();  // Все животные спят
        }
    }
}