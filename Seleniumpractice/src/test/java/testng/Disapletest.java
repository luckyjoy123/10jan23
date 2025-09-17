package testng;

import org.testng.annotations.Test;

public class Disapletest {
  @Test(priority = -1)
  public void f() {
	  
	  System.out.println("test1");
  }
  
  @Test
  public void a() {
	  System.out.println("test2");
  }
  @Test
  public void b() {
	  System.out.println("test3");
  }
  @Test
  public void c() {
	  System.out.println("test4");
  }
}
