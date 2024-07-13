package TestNG;

import org.testng.annotations.Test;

public class groupingmethods {
	@Test(groups={"cricket"})
	public void bag1() {
		System.out.println("cricketball");
	}
	@Test(groups={"foot"})
	public void bag2() {
		System.out.println("football");
	}
	@Test(groups={"basket"})
	public void bag3() {
		System.out.println("basketball");
	}
	@Test(groups={"volley"})
	public void bag4() {
		System.out.println("volleyball");
	}
}
