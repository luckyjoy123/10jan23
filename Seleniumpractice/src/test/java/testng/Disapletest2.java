package testng;

import org.testng.annotations.Test;

public class Disapletest2 {
  @Test
  public void s() {
	  
	  System.out.println("test5");
  }
  
  @Test(invocationCount =2)
  public void x() {
	  System.out.println("test6");
  }
  @Test
  public void y() {
	  System.out.println("test7");
  }
  @Test
  public void z() {
	  System.out.println("test8");
  }
}
