package TestNG;

import org.testng.annotations.Test;

public class depends {
@Test(priority=0)
	
public void estcase(){
	System.out.println("adhkcahjcvaejh");
		
	}
@Test(priority=1)
public void destcase1(){
	System.out.println("adhkcejh");
	
}
@Test(priority=2,enabled = false)
public void aestcase2(){
	System.out.println("adhkcahjejh");
	
}
//testng always executes alphabetical wise. for that you have to set priority whichever you want

// using enabled we can skip a testcase 
}
