import sinfo.Student;//Imported Student class from sinfo package 
public class ImportPackage {
    public static void main(String[] args) {
        Student obj = new Student();//Student class object
        obj.setName("Abhijeet");
        obj.setRoll(84);
        System.out.println("Name: "+obj.showName());
        System.out.println("Roll No: "+obj.showRoll());
    }

}