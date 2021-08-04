
public class StringMethods {
    public static void main(String[] args) {
        String s1="Abhijeet";

        System.out.println(s1);
        System.out.println(s1.toUpperCase());//returns new string with all uppercase.
        System.out.println(s1.toLowerCase());//will not modify the string
        System.out.println(s1);

        System.out.println(s1.indexOf('j'));//character
        System.out.println(s1.indexOf("ee"));//string
        System.out.println(s1.indexOf('i',2));//character from index 2
        System.out.println(s1.indexOf('i',4));//return -1 because it will not find i since its index is 3 and we r searching from index 4.

        String s2="tictactoe";

        System.out.println(s2.lastIndexOf('i'));//search from last index
        System.out.println(s2.lastIndexOf("tac", 2));//-1 because search from 2 to 0 and index of tac is 3
        System.out.println(s2.lastIndexOf("tac"));
        System.out.println(s2.lastIndexOf('i',2));

        String s3="computer";
        String s4="Computer";

        System.out.println(s3.equals(s4));//false since computer is not equal Computer //case sensetive
        System.out.println(s3.equalsIgnoreCase(s4));//true because we ignore the cases.
        System.out.println(s3.compareTo(s4));//return 32 because C=67 and c=99 and 99-67=32
        System.out.println(s4.compareTo(s3));//return -32 because C=67 and c=99 and 67-99=-32
        System.out.println(s3.compareToIgnoreCase(s4));//return zero because same if ignore case

        System.out.println(s3.substring(3));//from 3 to end of string
        System.out.println(s3.substring(3,6));//from 3 to 6 exclude 6

    }

}