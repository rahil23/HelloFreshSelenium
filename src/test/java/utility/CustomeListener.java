package utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomeListener implements ITestListener 
{

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext arg0) 
	{
		try 
		{
			//patternlayout layout =new patternlayout("%m%d%n");
			//String logfile ="./logfile/result.log";
			//fileappender appender =new fileappender(layout,logfile);
			//basicconfiguration.configure(appender);
			//Logger l=Logger.getLogger(CustomeListener);
			//l.setLevel(Level.ALL);
		} 
		catch (Exception e) 
		{
		
		}
		
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult arg0) 
	{
	String methodname=arg0.getMethod().getMethodName();
	String imgpath="./ScreenShot/"+methodname+".jpg";
	Screenshot.captureDesktop(imgpath);
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
