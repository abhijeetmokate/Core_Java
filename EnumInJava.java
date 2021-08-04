
 enum season{
    SUMMER,WINTER,MONSOON;
}



public class EnumInJava {

    
    public static void main(String[] args) {


        for(season s: season.values())
        System.out.println(s);
    }
}
