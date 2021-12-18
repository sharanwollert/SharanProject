package JavaOOPSconcepts;

import org.junit.Test;

public class AT04_Encapsulation02 {
    @Test
    public void envMethod03(){
        AT03_Encapsulation01 obj = new AT03_Encapsulation01();
        //whatever is in the method is printed to console
        obj.envMethod01(10,20);


        // return statement usage
        int l = 10 + obj.envMethod02(60,60);
        System.out.println(l);
    }
}
