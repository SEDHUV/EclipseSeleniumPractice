package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterization {
	
	@Test
	@Parameters("Par")
	public void name1(String output) {
		System.out.println(output);
		
	}

}
