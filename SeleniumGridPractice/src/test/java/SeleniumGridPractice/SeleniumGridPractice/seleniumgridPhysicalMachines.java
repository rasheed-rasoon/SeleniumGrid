package SeleniumGridPractice.SeleniumGridPractice;


	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
	import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
	import java.net.URL;
	public class seleniumgridPhysicalMachines {

		WebDriver driver;
	    String baseUrl,nodeUrl;
	    @BeforeTest
	    @Parameters(value={"browser"})
	    public void setUpTest(String browser) throws MalformedURLException
	    {
	        DesiredCapabilities capability=null;
	        baseUrl="http://inctest.apcgg.gov.in";
	        nodeUrl="http://10.2.24.47:4444/wd/hub";
	        if(browser.equalsIgnoreCase("chrome"))
	        {
	        //System.setProperty("webdriver.chrome.driver","D:\\stdy\\softwares\\drivers\\chromedriver.exe");
	         capability=DesiredCapabilities.chrome();

	         capability.setBrowserName("chrome");
	        //capability.setPlatform(Platform.WINDOWS);
	         ChromeOptions opt=new ChromeOptions();
	         opt.merge(capability);
	        driver= new RemoteWebDriver(new URL(nodeUrl),opt);
	        }
	        else if(browser.equalsIgnoreCase("firefox"))
	        {
	   
	              //System.setProperty("webdriver.chrome.driver","D:\\stdy\\softwares\\drivers\\chromedriver.exe");
	               capability=DesiredCapabilities.firefox();

	               capability.setBrowserName("firefox");
	              //capability.setPlatform(Platform.WINDOWS);
	               FirefoxOptions opt=new FirefoxOptions();
	               opt.merge(capability);
	              driver= new RemoteWebDriver(new URL(nodeUrl),opt);
	        }
	    }   

	    @AfterTest
	    public void afterTest()
	    {
	        driver.quit();
	    }
	   
	    @Test
	    public void simpleTest()
	    {
	       
	        driver.get(baseUrl);
	       
	    }

}


	