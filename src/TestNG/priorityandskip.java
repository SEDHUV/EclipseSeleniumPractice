package TestNG;

import org.testng.annotations.Test;

public class priorityandskip {
@Test()
	
 public void estcase(){
	System.out.println("adhkcahjcvaejh");
		
	}
@Test(dependsOnMethods ="estcase")
public void destcase1(){
	System.out.println("adhkcejh");
	
}
@Test(dependsOnMethods = "destcase1")
public void aestcase2(){
	System.out.println("adhkcahjejh");
	
}
//testng always executes alphabetical wise. for that you have to set priority whichever you want

// using enabled we can skip a testcase 
}
