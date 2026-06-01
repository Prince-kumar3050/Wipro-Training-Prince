package Rest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
	
	
	    static ExtentReports extent;

	    public static ExtentReports getReportObject()
	    {
	        String path = System.getProperty("user.dir") + "/reports/APIReport.html";

	        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
	        reporter.config().setReportName("REST API Automation Report");
	        reporter.config().setDocumentTitle("API Test Results");
	        reporter.config().setReportName("CRUD API Automation Report");
	        reporter.config().setDocumentTitle("REST API Testing");


	        extent = new ExtentReports();
	        extent.attachReporter(reporter);

	        extent.setSystemInfo("Tester", "Prince Kumar");

	        return extent;
	    }
	}


