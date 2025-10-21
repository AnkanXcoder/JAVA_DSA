public class Hybridinhe {
    public static void main(String[] args) {
        Tuna tuna = new Tuna();
        tuna.fins = 6;
        System.out.println(tuna.fins);
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
class Tuna extends Fish {
    int fins;
    
}
class Shark extends Fish {
    String skincolor;
}
class Peacock extends Bird {
    String gender;
}
class Dog extends Mammals {
    String size;
}
class Human extends Mammals {
    String color;
}
class Cow extends Mammals {
    int legs;
}





