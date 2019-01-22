

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class MagentoTest
{
	@Test
	public void magento()
	{
		String url="http://www.magento.com";
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		HomePage h=new HomePage(driver);
		h.clickOnMyAcc();
		Login l1=new Login(driver);
		l1.typeEmail("nitinmanjunath1991@gmail.com");
		l1.typePassword("Welcome123");
		l1.clickOnLogin();
		Logout l2=new Logout(driver);
		l2.clockOnLogout();
		 
		
			driver.quit();	

	}
		
	

}
