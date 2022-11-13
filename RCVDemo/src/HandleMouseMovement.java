import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class HandleMouseMovement {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\software\\Browser Drivers\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		/*HashMap<String,Object> contentSettings=new HashMap<String,Object>();
		HashMap<String,Object> profile=new HashMap<String,Object>();
		HashMap<String, Object> prefs=new HashMap<String, Object>();
		
		contentSettings.put("geolocation",1);
		profile.put("manage_default_content_settings", contentSettings);
		prefs.put("profile", profile);*/
		
		//options.setExperimentalOption("excludeSwitches",Arrays.asList("disable-notifications"));
		options.addArguments("disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://www.spicejet.com/");
		
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		//driver.switchTo().alert().dismiss();

		Actions action=new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//div[@class='css-76zvg2 r-jwli3a r-ubezar r-16dba41 r-1pzd9i8' and text()='Add-ons']"))).build().perform();
		Thread.sleep(5000);
		action.moveToElement(driver.findElement(By.xpath("//div[@class='css-76zvg2 r-homxoj r-ubezar' and text()='SpiceMAX']"))).click().perform();
		
		

	}

}
