public class polymorphism {
    public static void main(String[] args) {
        // method overloading
       Calculator cal = new Calculator();
       System.out.println(cal.sum((float)4.5, (float)5.3)); 
       System.out.println(cal.sum(5, 4));
       System.out.println(cal.sum(5, 4,3));
       // method overriding
       Deer d = new Deer();
       d.eat();


    }
}
// method overriding
class Animal{
    void eat(){
        System.out.println("eat anythinf");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("eats grass");
    }
}
// method overloading
class Calculator {
    int sum(int a , int b){
        return a+b;
    }
    int sum(int a , int b, int c){
        return a+b+c;
    }
    float sum(float a , float b){
        return a +b;
    }
}
 