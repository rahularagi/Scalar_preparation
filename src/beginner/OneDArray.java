package beginner;

import java.util.Scanner;

public class OneDArray {
    //1D Array  also known as static array because you can not change size of array
    //sachin ODI matches 463

    public static void main(String [] args){
        System.out.println(args.toString());

        int array1 [] = new int[5];
        for(int i = 0;i<5;i++){
            System.out.println(array1[i]);
        }
        // initial value is 0 for all index ex :{0,0,0,0,0}
        int array2 [] = {1,2,3};
                       //0,1,2
        Scanner s =new Scanner(System.in);
        System.out.println(" enter size of array");
        int a = s.nextInt();
        int [] array = new int[a];


        for(int i = 0; i<a;i++){
            System.out.println("Enter "+i+" index value");
            int b = s.nextInt();
            array[i] = b;
        }
        System.out.println(array);

    }
}
