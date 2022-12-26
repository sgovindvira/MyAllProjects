package tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Testing1 {
  @Test(dataProvider = "dp")
 public void f(Integer n, String s) {
	  System.out.println(n+s);
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("BeforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterMethod");
  }


 @DataProvider   //If we want to run 1 particular 1 test multiple time then we use data provide, see above example
 public Object[][] dp() {
    return new Object[][] {
     new Object[] { 1, "a" },
     new Object[] { 2, "b" },
     new Object[] {9, "c"},
     };
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("BeforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("afterClass");

  }

  @BeforeTest
  public void beforeTest() { System.out.println("beforetest");

  }

  @AfterTest
  public void afterTest() { System.out.println("after test");

  }

  @BeforeSuite
  public void beforeSuite() { System.out.println("before suite");

  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("aftersuite");

  }
  @Test(groups ="sanity")
  public void test1() { System.out.println("test1");
  }
  
  @Test
  public void test2() { System.out.println("test2");

}
}