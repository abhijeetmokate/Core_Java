package studentobj;
import sinfo.Student;
public class Run {
    public static void main(String[] args) {
    
    Student obj1 = new Student();
    obj1.setName("Mokate");
    obj1.setRoll(94);
    System.out.println("Name: " + obj1.showName() + "\nRoll No: " + obj1.showRoll());
    }
}