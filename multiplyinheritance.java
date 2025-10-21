public class multiplyinheritance {
    public static void main(String[] args) {
        Beer b = new Beer();
        b.eatGrass();
        b.eatmeat();
    }
}
interface Harbivore {
  void eatGrass();
}
interface Carnivore {
   void eatmeat();
}
 class Beer implements Harbivore , Carnivore {
    public void eatGrass() {
    System.out.println("Beer eat grass");
    }
    public void eatmeat(){
        System.out.println("Beer eat meat");
    }
 }