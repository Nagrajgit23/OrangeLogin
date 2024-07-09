package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Logininvalid2 {
	WebDriver driver;
	@Test
	public void invalidpassword()
	{
		System.out.println("invalidpassword");
	 	WebElement untb = driver.findElement(By.name("username"));
        untb.sendKeys("Admin");
        WebElement pwtb = driver.findElement(By.name("password"));
        pwtb.sendKeys("administra123");
        WebElement lbck = driver.findElement(By.xpath("//button[@type='submit']"));
	    lbck.click();
	}
}
