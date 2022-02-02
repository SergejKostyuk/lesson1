package dz;
/* * Java. Level 1. Lesson 6.
 * @author Sergey Kostsyk
 * @version dated 02 feb, 2022
 */

public class HomeWork6 {
    public static void main(String[] args){
        Cat cat= new Cat(200);
        Dog dog= new Dog(500, 10);
        IAnimal []animals= {cat, dog};
        for (IAnimal animal :animals){
             System.out.println(animal);
             System.out.println(animal.run(200));
             System.out.println(animal.run(500));
             System.out.println(animal.run(600));
             System.out.println(animal.swim(10));
             System.out.println(animal.swim(15));
        }
        System.out.println("Уоличество созданых животных: " + Animal.getCountOfAnimals());
    }
}
interface IAnimal{
    String run(int distanz);
    String swim(int distanz);
}
class Cat extends Animal{
    Cat(int runLimit, int swimLimit){
        super(runLimit, swimLimit);
    }
    Cat(int runLimit){
        super(runLimit, 0);
    }
    @Override
    public String swim(int distanz){
        return getClassName() + "   Неумеет плавать. ";
    }
}
class Dog extends Animal{
    Dog(int runLimit, int swimLimit){
        super(runLimit, swimLimit);
    }
}

abstract class Animal implements IAnimal {
    protected int runLimit;
    protected int swimLimit;
    protected String className;
    protected static int countOfAnimals = 0;

    Animal(int reuLimit, int swimLimit){
        this.runLimit=reuLimit;
        this.swimLimit=swimLimit;
        className=getClass().getSimpleName();
        countOfAnimals++;
    }
    public String getClassName(){
        return className;
    }
    public static int getCountOfAnimals(){
        return countOfAnimals;
    }
    @Override
    public String run(int distanz){
        if(distanz>runLimit){
            return className +"   Не смог пробежать! "+ distanz;
        } else {
            return className + "   Удачная пробежка. " + distanz;
        }
    }
    @Override
    public String swim(int distanz){
        if(distanz>swimLimit){
            return className +"   Не смог проплыть! "+ distanz;
        } else {
            return className + "   Удачный заплыв. " + distanz;
        }
    }
    @Override
    public String toString(){
        return className + "   Растояние бега: " + runLimit +"   Растояние заплыва:  " + swimLimit;
    }
}
