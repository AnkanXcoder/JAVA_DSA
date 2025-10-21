public class inheritance {
    public static void main(String[] args) {
        Dog bobby = new Dog();
        bobby.eat();
        bobby.legs = 4;
        System.out.println(bobby.legs);
    }
}
 //base class
class Animal {
    String color;
    void eat() {
        System.out.println("eats");
    }
    void breathe() {
        System.out.println("breathes");
    }
}
class Mammals extends Animal {
    int legs;
}
class Dog extends Mammals{
    String breed;
}
//derived class/subclass
/*class Fish extends Animal {
   int fins;
   void swim() {
     System.out.println("swims in water");
   }
}*/
