package seleniumgridprac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SampleCodeForMaven {
	public WebDriver driver;
@BeforeTest
@Parameters("browser")
public void browserLaunch(String browser)
{
	if(browser.equalsIgnoreCase("chrome"))
	{
	System.setProperty("webdriver.chrome.driver","F:\\softwares\\Drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	}
	else if(browser.equalsIgnoreCase("firefox"))
	{
		System.setProperty("webdriver.gecko.driver","F:\\softwares\\Drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
	}

	
}
@Test
public void enterUrl()
{
	
	driver.get("http://inctest.apcgg.gov.in");
	driver.manage().window().maximize();
}
}
