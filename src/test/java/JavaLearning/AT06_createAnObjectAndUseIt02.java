package JavaLearning;

import org.junit.Test;

public class AT06_createAnObjectAndUseIt02 {

    @Test
    public void test09(){
        //we created an object of another class
        AT02_LearnAboutMethod_JUnit obj = new AT02_LearnAboutMethod_JUnit();
        //now we will call method inside that class
        obj.test01();
        obj.test02();

    }

}
