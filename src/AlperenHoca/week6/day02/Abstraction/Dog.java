package AlperenHoca.week6.day02.Abstraction;

public class Dog extends EvcilHayvan{
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    protected void eat() {
        System.out.println("Dog chews meat.");
    }

    @Override
    public void makeSound() {
        System.out.println("Dog barks. #BarkBark");
    }

    public void bringTheStick(){
        System.out.println("Dog brings the stick back!");
    }

}
