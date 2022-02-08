import javax.management.MalformedObjectNameException;

/* * Java. Level 1. Lesson 7.
 * @author Sergey Kostsyk
 * @version dated 06 feb, 2022
 */
public class HomeWork7 {
    public static void main(String[] args) {
        Cat[] cats = { new Cat("Bars", 2), new Cat("Murz", 15), new Cat("Dobi", 5) };
        Plate plate = new Plate(15);
        System.out.println(plate);
        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(plate);
        }

        plate.dobavIat(2);
        System.out.println(plate);

        for (Cat cat : cats) {
            cat.setSyutast(false);
            cat.eat(plate);
            System.out.println(cat);
        }
    }
}

class Cat {
    private String name;
    private int appetit;
    private boolean syutast;

    Cat(String name, int appetit) {
        this.name = name;
        this.appetit = appetit;
        syutast = false;
    }

    public void setSyutast(boolean status) {
        syutast = status;
    }

    public void eat(Plate plate) {
        if (!syutast) {
            syutast = plate.dellFood(appetit);
        }
    }

    @Override
    public String toString() {
        return "Кличка: " + name + "   Аппетит: " + appetit + "   Сытасть: " + syutast;
    }
}

class Plate {
    private int food;

    Plate(int food) {
        this.food = food;
    }

    public boolean dellFood(int porz) {
        if (food < porz) {
            return false;
        }
        this.food -= porz;
        return true;
    }

    public void dobavIat(int kolich) {
        this.food += kolich;
    }

    @Override
    public String toString() {
        return "Количество еды в тарелке: " + food;
    }
}