
public class Run {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.setAddress("Nashik");
        obj.setAge(20);
        obj.setName("Abhijeet");
        obj.setRollNo(84);

        System.out.println("Name: "+obj.showName());
        System.out.println("Roll No: "+obj.showRollNo());
        System.out.println("Age: "+obj.showAge());
        System.out.println("Address: "+obj.showAddress());
    }

}