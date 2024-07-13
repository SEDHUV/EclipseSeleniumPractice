package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertions {
	@Test
	public void assert1() {
		String j = "sedhu-haema";
		boolean value = true;
		Assert.assertEquals(j,"sedhu-haema");
		Assert.assertTrue(value);
		Assert.assertFalse(value, "this should be true");
		
		
		
		
	}

}
