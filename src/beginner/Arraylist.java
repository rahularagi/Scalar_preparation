package beginner;
import java.util.*;
import java.lang.*;

public class Arraylist {
    public static void main(String [] args){
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(7);
        al.add(9);
        al.add(7);
        System.out.println(al);
        al.remove(1);
        al.add(1,10);
        System.out.println(al);

    }
}
