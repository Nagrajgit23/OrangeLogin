package login;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 

public class Loginvalid 
	{
	WebDriver driver;
	@BeforeSuite
	public void invokebrowser()
	{
	System.setProperty("Webdriver.Chrome.driver","C:\\Users\\mjnag\\Desktop\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
	}	
	
	@BeforeMethod
	public void Loginpage()
	{
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //Thread.sleep(3000);
	}
	@Test
	public void loginvalid() 
	{
		    System.out.println("loginvalid");
		 	WebElement untb = driver.findElement(By.name("username"));
	        untb.sendKeys("Admin");
	        WebElement pwtb = driver.findElement(By.name("password"));
	        pwtb.sendKeys("admin123");
	        WebElement lbck = driver.findElement(By.xpath("//button[@type='submit']"));
		    lbck.click();
	}
/*	@Test
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
	}*/
	@AfterSuite
	public void closebrowser()
	{
		driver.close();
	}

	}

