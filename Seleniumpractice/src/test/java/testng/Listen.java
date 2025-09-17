package testng;

import static org.testng.Assert.assertTrue;

import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners({Itest.class})
public class Listen {
	
  
  @Test 
  public void f() {
	  throw new SkipException("Skipped");
	 
  }
  
  @Test
  public void a() {
	  System.out.println("test2");
	  assertTrue(false);
  }
  @Test(timeOut =0000)
  public void b() {
	  System.out.println("test3");
  }
  @Test
  public void c() {
	  System.out.println("test4");
  }
}
