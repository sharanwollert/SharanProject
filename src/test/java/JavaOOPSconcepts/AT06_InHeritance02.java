package JavaOOPSconcepts;

import org.junit.Test;

//here AT06_InHeritance02-child , AT05_InHeritance01-parent
public class AT06_InHeritance02 extends AT05_InHeritance01 {

    @Test
    public void inhMethod04(){
        System.out.println("This is InhMethod04");
    }

//child method overwrites parent method
@Test
public void inhMethod03(){
    System.out.println("I am child method over-riding parent");
}
}
