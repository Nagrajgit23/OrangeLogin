package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Logininvalid1 {
	WebDriver driver;
	@Test
	public void invalidusername()
	{
		System.out.println("invalidusername");
	 	WebElement untb = driver.findElement(By.name("username"));
        untb.sendKeys("administra");
        WebElement pwtb = driver.findElement(By.name("password"));
        pwtb.sendKeys("admin123");
        WebElement lbck = driver.findElement(By.xpath("//button[@type='submit']"));
	    lbck.click();
	}
}
