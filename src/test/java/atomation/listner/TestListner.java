package atomation.listner;

import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Date;

import static com.codeborne.selenide.ex.ErrorMessages.screenshot;

public class TestListner implements ITestListener {

    private Logger logger = Logger.getLogger(TestListner.class);

    public void onTestStart(ITestResult iTestResult) {
        logger.info("test started");
    }

    public void onTestSuccess(ITestResult iTestResult) {
        logger.info("test success");
    }

    public void onTestFailure(ITestResult iTestResult) {
        Date failedTime = new Date(iTestResult.getEndMillis());
        logger.error("" + failedTime + iTestResult.getTestClass() + iTestResult.getTestName());
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        Throwable cause = iTestResult.getThrowable();
        cause.printStackTrace(printWriter);
        logger.error(stringWriter.getBuffer().toString());
        screenshot("screen");
    }

    public void onTestSkipped(ITestResult iTestResult) {
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
    }

    public void onStart(ITestContext iTestContext) {

    }

    public void onFinish(ITestContext iTestContext) {

    }
}
