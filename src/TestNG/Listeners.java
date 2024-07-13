package TestNG;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.ITestContext;

public class Listeners implements ITestListener {



    @Override		
    public void onFinish(ITestContext arg0) {					
        // TODO Auto-generated method stub
    	System.out.println("onfinish");
        		
    }		

    @Override		
    public void onStart(ITestContext arg0) {					
        // TODO Auto-generated method stub
   System.out.println("onstart");
        		
    }		

    @Override		
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					
        // TODO Auto-generated method stub	
    	System.out.println("ontestfailedwithinsuccess");
        		
    }		

    @Override		
    public void onTestFailure(ITestResult arg0) {					
        // TODO Auto-generated method stub
    	System.out.println("ontestfailure");
        		
    }		

    @Override		
    public void onTestSkipped(ITestResult arg0) {					
        // TODO Auto-generated method stub
    	System.out.println("ontestskipped");
        		
    }		

    @Override		
    public void onTestStart(ITestResult arg0) {					
        // TODO Auto-generated method stub
    	
    	System.out.println("onteststart");
        		
    }		

    @Override		
    public void onTestSuccess(ITestResult arg0) {					
        // TODO Auto-generated method stub	
    	System.out.println("ontestsuccess");
        		
    }
}
