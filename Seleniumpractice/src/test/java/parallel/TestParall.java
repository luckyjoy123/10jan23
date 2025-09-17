package parallel;

import org.testng.annotations.Test;

public class TestParall {
	@Test
	public void test1()
	{
		System.out.println("Test1"+"thread"+Thread.currentThread().getId());
	}
	
	@Test
	public void test2()
	{
		System.out.println("Test2"+"thread"+Thread.currentThread().getId());
	}
	@Test
	public void test3()
	{
		System.out.println("Test3"+"thread"+Thread.currentThread().getId());
	}
	@Test
	public void test4()
	{
		System.out.println("Test4"+"thread"+Thread.currentThread().getId());
	}

}
