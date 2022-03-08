package Week7_Hooks;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basepage {
	
	public ChromeDriver driver;
	@BeforeMethod
	public void launch()
	{
    WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
		     driver.get("http://leaftaps.com/opentaps/control/main");
		     driver.manage().window().maximize();
}
	
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}
	
}