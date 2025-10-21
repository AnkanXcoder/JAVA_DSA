

public class Hierarchialinheritance {
    public static void main(String[] args) {
        Bird crow = new Bird();
        crow.breathe();
        Fish promphet = new Fish();
        promphet.swim();
    }
    
}
class Animal {
    String color;
    void eat() {
        System.out.println("eats");
    }
    void breathe() {
        System.out.println("breathes");
    }
}
class Fish extends Animal {
    void swim(){
        System.out.println("Swims in water");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("Flying in the sky");

    }
}
class Mammals extends  Animal {
    void walk(){
        System.err.println("Walk in earth");
    }
}
