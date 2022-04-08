package listerners;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
public class listerners23252 implements ITestListener
{
@Override
public void onTestStart(ITestResult result) {
	Reporter.log("stared",true);
	ITestListener.super.onTestStart(result);
}

@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("finished",true);
		ITestListener.super.onTestSuccess(result);
	}

@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("failed",true);
		ITestListener.super.onTestFailure(result);
	}

@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("skipped",true);
		ITestListener.super.onTestSkipped(result);
	}

}
