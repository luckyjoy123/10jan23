package testng;

import org.testng.annotations.Test;

public class Groups {
  @Test(groups = {"regression testing"})
  public void f() {
	  
	  System.out.println("test5");
  }
  
  @Test (groups = {"regression testing","smoke testing"})
  public void a() {
	  System.out.println("test6");
  }
  @Test(groups = {"regression testing","smoke testing","sanity testing"})
  public void b() {
	  System.out.println("test7");
  }
  @Test(groups = {"regression testing"})
  public void c() {
	  System.out.println("test8");
  }
}
