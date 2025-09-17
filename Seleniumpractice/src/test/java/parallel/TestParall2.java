package parallel;

import org.testng.annotations.Test;

public class TestParall2 {
	@Test
	public void test5()
	{
		System.out.println("Test5"+"thread"+Thread.currentThread().getId());
	}
	
	@Test
	public void test6()
	{
		System.out.println("Test6"+"thread"+Thread.currentThread().getId());
	}
	@Test
	public void test7()
	{
		System.out.println("Test7"+"thread"+Thread.currentThread().getId());
	}
	@Test
	public void test8()
	{
		System.out.println("Test8"+"thread"+Thread.currentThread().getId());
	}

}
