package assignment;

import org.testng.annotations.Test;

public class TestNGClass2 {

    @Test(groups = {"Test1"})
    public void method1(){
        System.out.println("Method 1 of class 2");
    }

    @Test(priority = 3,groups = {"Test2"})
    public void method2(){
        System.out.println("Method 2 of class 2");
    }

    @Test
    public void method3(){
        System.out.println("Method 3 of class 2");
    }

}
