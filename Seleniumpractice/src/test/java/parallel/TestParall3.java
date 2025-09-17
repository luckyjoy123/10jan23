package parallel;

import org.testng.annotations.Test;

public class TestParall3 {
	@Test
	public void test9()
	{
		System.out.println("Test9"+"thread"+Thread.currentThread().getId());
	}
	
	@Test
	public void test10()
	{
		System.out.println("Test10"+"thread"+Thread.currentThread().getId());
	}
	@Test
	public void test11()
	{
		System.out.println("Test11"+"thread"+Thread.currentThread().getId());
	}
	@Test
	public void test12()
	{
		System.out.println("Test12"+"thread"+Thread.currentThread().getId());
	}

}
