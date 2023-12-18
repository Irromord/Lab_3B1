package animals;

// Интерфейс для животных
public interface Animal {
    void eat();   
    void sleep();  
}

// Абстрактный класс для всех животных
public abstract class AnimalBase implements Animal {
    protected String name;
    protected int age;

    // Конструктор класса "AnimalBase"
    public AnimalBase(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void makeSound();  // Абстрактный метод для издания звука

    @Override
    public void eat() {
        System.out.println(name + " is eating.");  // Реализация метода "eat" для всех животных
    }

    @Override
    public void sleep() {
        System.out.println(name + " is sleeping.");  // Реализация метода "sleep" для всех животных
    }
}
