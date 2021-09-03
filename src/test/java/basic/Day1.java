package basic;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day1 {
	

@BeforeSuite
	private void tco() {
	System.out.println("suit");

	}
@BeforeMethod
private void tc1() {
	System.out.println("method1");

}

@BeforeClass
private void tc2() {
	System.out.println("class1");

}
@Test
private void tc3() {
	System.out.println("test2");

}
@Test
private void tc4() {
	System.out.println("test3");

}

}