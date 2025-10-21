public class OOPS {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // created a pen object called p1
        p1.setColor("Red");
        System.out.println(p1.getColor());
        p1.setTip(6);
        
        System.out.println(p1.getTip());
         Student s1 = new Student();
       /* BankAccount myAcc = new BankAccount();
        myAcc.username = "Ankan sen";
        myAcc.setPassword("Abc");*/
     }
}
/*class  BankAccount{
   public String username;
   private String password;
   public void setPassword(String pwd){
     password = pwd;
   }
      
}*/
class Pen {
    private  String color;
    private   int tip;
    String getColor(){
        return this.color;
    }
    int getTip(){
        return  this.tip;
    }
    void setColor(String newColor){
        this.color = newColor;
    }
    void setTip(int Tip){
        this.tip = Tip;
    }
}
class Student{
    String name;
    int age;

    Student(String name) {
      this.name = name;
    }
}