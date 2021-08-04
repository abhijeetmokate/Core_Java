
public class ArrayInJava {
    public static void main(String[] args) {
        int x=10;
        //declaration
        int arr[]=new int[5];
        int arr1[]=new int[x];

        int tdar[][]=new int[2][2];//2D array
        //int tdar1[][]=new int[][2];//error
        int tdar2[][]=new int[2][];//no error
        //initialization

        int arr2[]=new int[]{1,2,3,4,5};

        int arr3[]={2,34,1};

        int tdar4[][]=new int[][]{{3,4},{2,3}};

        //array is never blank 

        /*
        wrong methods:

        int arr[]=new int[2]{1,2,3,4};

        int arr[]=new int[3]{12,3,4};
        
        */
        
        
        int arrlen= arr.length;



    }

}