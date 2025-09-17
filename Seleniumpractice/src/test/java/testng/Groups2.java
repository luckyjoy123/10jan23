package testng;

import org.testng.annotations.Test;

public class Groups2 {
  @Test(groups = {"regression testing","smoke testing","sanity testing"})
  public void f() {
	  
	  System.out.println("test1");
  }
  
  @Test(groups = {"smoke testing"})
  public void a() {
	  System.out.println("test2");
  }
  @Test(groups = {"sanity testing"})
  public void b() {
	  System.out.println("test3");
  }
  @Test(groups = {"regression testing","sanity testing"})
  public void c() {
	  System.out.println("test4");
  }
}
