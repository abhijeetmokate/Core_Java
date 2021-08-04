package mypackage;//to make the package of mypackage name
/**
 * classes with similar behaviour are place in one package
 * two packages can contain the classes with same name
 * compile this file as "javac -d . PackagesInJava.java"
 * dot(.) means parent folder
 * then mypackage folder created containing the PackagesInJava class
 * run using command "java mypackage.PackagesInJava"
 */
public class PackagesInJava {
    public static void main(String[] args) {
        System.out.println("This Is mypackage file output");
    }

}