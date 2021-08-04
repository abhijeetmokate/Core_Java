public class StringClass
{
    public static void main(String[] args) {

        //s1 and s2 both refer to the same object since the charatcter sequence is same 
        //but the s3 refer to the new seperate object created using new keyword

        String s1="Abhijeet";
        String s2="Abhijeet";
        String s3= new String("Abhijeet");

         System.out.println(s1==s2);//true ->check whether object is same i.e address
         System.out.println(s1.equals(s2));//true ->check whether string is same
         System.out.println(s1==s3);//false-> diff objects
         System.out.println(s1.equals(s3));//true-> same string

        System.out.println(s1);
    }
}