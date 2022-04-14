package assignment;

import org.testng.annotations.Test;

public class TestNGClass1 {
    @Test(priority = 2,groups = {"Test1","Test2"})
    public void method1(){
        System.out.println("Method 1 of class 1");
    }

    @Test(priority = 1)
    public void method2(){
        System.out.println("Method 2 of class 1");
    }

    @Test(priority = 1,groups = {"Test1"})
    public void method3(){
        System.out.println("Method 3 of class 1");
    }

}
