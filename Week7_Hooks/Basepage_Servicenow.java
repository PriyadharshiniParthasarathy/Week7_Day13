package Week7_Hooks;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basepage_Servicenow {
	
	public ChromeDriver driver;
	@BeforeMethod
	public void launch()
	{
    WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
		     driver.get("https://dev94415.service-now.com");
		     driver.manage().window().maximize();
		     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		     
}
	
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}
	
}