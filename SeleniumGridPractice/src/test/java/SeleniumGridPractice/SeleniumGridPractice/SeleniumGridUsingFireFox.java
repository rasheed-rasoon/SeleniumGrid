package SeleniumGridPractice.SeleniumGridPractice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumGridUsingFireFox {
	WebDriver driver;
    String baseUrl,nodeUrl;
    @BeforeTest
    public void setUp() throws MalformedURLException
    {
        DesiredCapabilities capability=null;
        baseUrl="http://inctest.apcgg.gov.in";
        nodeUrl="http://10.2.24.47:4444/wd/hub";
        //System.setProperty("webdriver.chrome.driver","D:\\stdy\\softwares\\drivers\\chromedriver.exe");
         capability=DesiredCapabilities.firefox();

         capability.setBrowserName("firefox");
        //capability.setPlatform(Platform.WINDOWS);
         FirefoxOptions opt=new FirefoxOptions();
         opt.merge(capability);
        driver= new RemoteWebDriver(new URL(nodeUrl),opt);
       
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
    @Test
    public void simpleTest2()
    {
       
        driver.get("https://mail.cgg.gov.in");
       
    }
}
