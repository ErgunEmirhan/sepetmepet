package AlperenHoca.week6.day02.Abstraction;

public class Cat extends EvcilHayvan{
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    protected void eat() {
        System.out.println(name +" is eating catfood.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " meows...");
    }

    public  void playWithwoolBall(){
        System.out.println("Cat is playing with woolball.");
    }

}
