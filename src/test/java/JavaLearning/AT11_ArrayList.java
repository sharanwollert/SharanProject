package JavaLearning;

import org.junit.Test;

import java.util.ArrayList;

public class AT11_ArrayList {

    @Test
    public void test14() {
        // here we created an object of ArrayList
        ArrayList al = new ArrayList();
        // we started adding values in ArrayList
        al.add(10);
        al.add(11);
        al.add(12);
        al.add(13);
        al.add(14);
        al.add("Software");
        al.add("TestLab");
        al.add("Pty");
        al.add("Ltd");
// Here we found size of arraylist
        int ArrayListLength = al.size();
        System.out.println(ArrayListLength);
//using for loop we printed each value in arraylist
        for (int i = 0; i < ArrayListLength; i++) {
            System.out.println("Array index : " + i + " its value is :" + al.get(i));

        }


    }
}
