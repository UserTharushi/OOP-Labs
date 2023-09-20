public class Animal{
    private String name;
    private int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void makeSound() {
        System.out.println("Animal makes a generic sound");
    }
     @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
    public class Mammal extends Animal {
    private String furColor;

   
    public Mammal(String name, int age, String furColor) {
        super(name, age);
        this.furColor = furColor;
    }
    @Override
    public void makeSound() {
        System.out.println("Mammal makes a mammal-specific sound");
    }
    @Override
    public String toString() {
        return super.toString() + ", Fur Color: " + furColor;
    }
}
public class Bird extends Animal {
    private double wingSpan;

    
    public Bird(String name, int age, double wingSpan) {
        super(name, age);
        this.wingSpan = wingSpan;
    }
     @Override
    public void makeSound() {
        System.out.println("Bird makes a bird-specific sound");
    }

    
    @Override
    public String toString() {
        return super.toString() + ", Wing Span: " + wingSpan;
    }
}
public class Dog extends Mammal {
    private String breed;

    
    public Dog(String name, int age, String furColor, String breed) {
        super(name, age, furColor);
        this.breed = breed;
    }

    
    @Override
    public String toString() {
        return super.toString() + ", Breed: " + breed;
    }
}