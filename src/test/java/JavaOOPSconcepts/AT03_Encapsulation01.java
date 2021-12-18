package JavaOOPSconcepts;

import org.junit.Test;

public class AT03_Encapsulation01 {

    @Test
    public void envMethod01(int i,int j){

        System.out.println("total : "+(i+j));
    }

    @Test
    public int envMethod02(int i,int j){
        int k = i+j;
        return k;

    }

}


