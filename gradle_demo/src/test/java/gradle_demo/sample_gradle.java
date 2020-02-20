package gradle_demo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class sample_gradle 
{
	@Test
	public void sample()
	{
	System.setProperty("webdriver.chrome.driver","C:/Users/BLTuser.BLT1213/Downloads/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://in.linkedin.com/");
	driver.manage().window().maximize();
	}

}
