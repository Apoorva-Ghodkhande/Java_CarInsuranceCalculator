package reusableComponents;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ExtentSparkReporterConfig;
import com.aventstack.extentreports.reporter.configuration.Theme;

import testBase.ObjectRepo;

public class ExtentSetup extends ObjectRepo{

	public static ExtentReports setupExtentReport()
	{
		SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyy HH-mm-ss");
		Date date= new Date();
		
		String actualDate=format.format(date);
		String reportPath=System.getProperty("user.dir")+"/Reports/ExecutioReport_"+actualDate+".html";
		ExtentSparkReporter sparkReporter= new ExtentSparkReporter(reportPath);
		
		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
		sparkReporter.config().setDocumentTitle("DocumentTitle");
		sparkReporter.config().setTheme(Theme.DARK);
		sparkReporter.config().setReportName("ReportName");

return extent;
	}
	
}
