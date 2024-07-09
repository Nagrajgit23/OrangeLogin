package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Logininvalid3 {
	WebDriver driver;
	@Test
	public void invallidboth()
	{
		System.out.println("invallidboth");
	 	WebElement untb = driver.findElement(By.name("username"));
        untb.sendKeys("admintra");
        WebElement pwtb = driver.findElement(By.name("password"));
        pwtb.sendKeys("admintra123");
        WebElement lbck = driver.findElement(By.xpath("//button[@type='submit']"));
	    lbck.click();
	}
}
