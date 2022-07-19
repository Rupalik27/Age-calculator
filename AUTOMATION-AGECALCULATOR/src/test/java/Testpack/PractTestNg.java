package Testpack;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PractTestNg {

public class ClassTestNg {
	@BeforeClass 
    public void   beforeClass() {
		System.out.println("before class");
	}
	@BeforeMethod 
	public void beforeMethod() {
		System.out.println("before method");
	}
	@Test
	public void test1() {
		System.out.println("test");
}
}
}
