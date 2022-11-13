import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\software\\Browser Drivers\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://classic.crmpro.com/terms.html");
		
		//maximize window
	      driver.manage().window().maximize();
	      driver.manage().deleteAllCookies();
	   //Dynamic wait
	      driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	      driver.findElement(By.name("username")).sendKeys("jaybeselenium");
	      driver.findElement(By.name("password")).sendKeys("jay$123");
	      driver.findElement(By.xpath("//input[@type='submit']")).click();
	      Thread.sleep(3000);
	      driver.switchTo().frame("mainpanel");
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
	      
	      

	}

}
