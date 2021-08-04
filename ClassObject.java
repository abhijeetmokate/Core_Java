class Box
{
    private int length,breath,height;//instance member variable
    public void getDimension(int l,int b,int h) //instance member function
    {
        length=l;
        breath=b;
        height=h;
    }

    public void showDimension() //instance member function
    {
        System.out.println("The Dimension of the Box is:("+length+"x"+breath+"x"+height+")");
    }
}
public class ClassObject {

    public static void main(String[] args) {
        int l,b,h;
        l=10;b=20;h=30;
        Box obj = new Box();//obj is the reference variable for the object of class Box
        obj.getDimension(l, b, h);//accessing the member function through the reference variable obj of object
        obj.showDimension();
        obj=new Box();//objects are always made dynamically in JAVA and they dont have names
        obj.showDimension();
        System.out.println(obj);//will print the address of the instance of class Box 
    }


}