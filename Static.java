public class Static {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "AJCHS";
        Student s2 = new Student();
        System.out.println(s2.schoolName);
        Student s3 = new Student();  
        System.out.println(s3.schoolName);
    }
}
class Student {
   static int returnpercentage(int math, int phy, int bio){
        return (math+phy+bio)/3;
    }
    String name;
    int roll;
    static  String schoolName;
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
}
