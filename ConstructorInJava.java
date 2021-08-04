
/**
 * Constructor is a member function of a class.
 * The name of the constuctor is same as that of the class name.
 * Constructor has no return type.
 * Constructors are use to initialized the member variable of the class.
 * only after the proper initialization of member variable the object represents the real world entity.
 * e.g.box with l=b=h=0 is not a real world entity.we must initialize the l,b,h.
 * 
 * constructor overloading = constructors with same name but diff no & type of parameters 
 */
class Box
{
    private int length,height,breadth;
    public Box()
    {
        length=10;
        breadth=10;
        height=10;
    }
    public Box(int l,int b,int h)
    {
        length=l;
        breadth=b;
        height=h;
    }
    public Box(Box obj)
    {
        length=obj.length;
        breadth=obj.breadth;
        height=obj.height;
    }
    public void showData()
    {
        System.out.println("Length= "+length);
        System.out.println("Breadth= "+breadth);
        System.out.println("Height= "+height);
    }



}
public class ConstructorInJava {
    public static void main(String[] args) {
        
        Box obj1 = new Box();
        obj1.showData();

        Box obj2 = new Box(20,10,4);
        obj2.showData();

        Box obj3 = new Box(obj2);
        obj3.showData();


    }
}