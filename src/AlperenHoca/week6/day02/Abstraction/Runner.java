package AlperenHoca.week6.day02.Abstraction;

public class Runner {
    public static void main(String[] args) {
        Dog dog = new Dog("Karabaş",3);
        Cat cat = new Cat("Tarçın",2);
        cat.makeSound();
        dog.makeSound();
        cat.eat();
        dog.eat();
        cat.playWithwoolBall();
        dog.bringTheStick();


    }


}
