package JavaLearning;

import org.junit.Test;

public class AT03_StringInt {

    //how to declare integers
    @Test
    public void test03(){
        //local variables
        int i=10;
        int j=20;
        int k= i+j;
        //print on console
        System.out.println("value of K is : "+k);
        System.out.println("Total value is : "+(i+j));
    }
    @Test
    public void test04(){
        //local variables
        String test01= "Software";
        String Test02="testlab";
        String Test03=test01+" "+Test02;
        System.out.println("value of Test03 is : "+Test03);
    }

}
