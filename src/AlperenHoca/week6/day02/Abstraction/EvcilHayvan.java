package AlperenHoca.week6.day02.Abstraction;

public abstract class EvcilHayvan {
        protected String name;
        protected int age;

    protected EvcilHayvan(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    protected abstract void eat();
    protected abstract void makeSound();

    protected void sleep(){
        System.out.println(super.getClass().getSimpleName()+" is sleeping.");
    }




}
