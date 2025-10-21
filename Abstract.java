public class Abstract {
    
    public static void main(String[] args) {
        /*Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);
        Chiken c = new Chiken();
        c.eat();
        c.walk();
        */
        Mustang myHorse = new Mustang();
        
        
    
    }
}
abstract class Animal {
    String color;
    Animal() {
     System.out.println("animal constructor called");
    }
    
    void eat(){
        System.out.println("Animal eats");
    }
    abstract void walk();
}

class Horse extends Animal {

     Horse() {
        System.out.println("Horse constructor called");
    }
    
    void changeColor() {
        color = "white";
    }
    void walk(){
        System.out.println("walks on 4 legs");
    }
}
class Mustang extends Horse{

     Mustang() {
        System.out.println("Mustang constructor called");
    }
    
}

class Chiken extends Animal{
    void changeColor() {
        color = "black";
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }
}