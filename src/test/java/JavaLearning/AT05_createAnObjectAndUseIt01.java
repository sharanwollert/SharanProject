package JavaLearning;

import org.junit.Test;

public class AT05_createAnObjectAndUseIt01 {
    @Test
    public void test07(){
        //using classname we create an object
        AT05_createAnObjectAndUseIt01 obj = new AT05_createAnObjectAndUseIt01();
        //using that object we called method
        obj.test08();
        obj.test09();

    }

    public void test08(){
        //local variables
        int i=10;
        int j=20;
        int k= i+j;
        //print on console
        System.out.println("value of K is : "+k);

    }

    public void test09(){
        //local variables
        String test01= "Software";
        String Test02="testlab";
        String Test03=test01+" "+Test02;
        System.out.println("value of Test03 is : "+Test03);
    }
}
