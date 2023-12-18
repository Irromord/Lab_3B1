
// Пакет "birds"
package animals.birds;

import animals.AnimalBase;

// Класс для птиц
public abstract class Bird extends AnimalBase {
    public Bird(String name, int age) {
        super(name, age);
    }

    public abstract void layEggs(); 
}
