/**
 * This Keyword:
 * 1)It is reference variable
 * 2)It is a local variable in instance member method referring to caller object.
 * 3)ex.obj.setDimension() -->in setDimension() function this represent the caller object 'obj'.
 * 4)use to represent the caller object.
 * 5)we can pass the current object to another method using this keyword. 
 * 6)we can use this in constructor.
 * 7)can not use this keyword in static block.
 */
class Box
{
    private int l,b,h;
    public void setDimension(int l,int y,int z)//instance member function
    {
        //this refers to same object which is refer by caller object
        this.l=l;//this.l means the l variable of object refer by this keyword
        b=y;//even if we dont use still it is here
        h=z; 
    }
    public void fun()
    {
        System.out.println("The address of the caller object: "+this);
    }

}
public class ThisKeyword {
    public static void main(String[] args) {
        Box obj=new Box();
        obj.setDimension(23, 33, 8);
        obj.fun();//current obj address
    }

}