import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demopracticewebsite1 {

	/**
	 * @param args
	 * @throws Throwable 
	 */
	/**
	 * @param args
	 * @throws Throwable
	 */
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\software\\Browser Drivers\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://phptravels.org/register.php");
		//maximize window
	      driver.manage().window().maximize();
	      driver.manage().deleteAllCookies();
		driver.findElement(By.id("inputFirstName")).sendKeys("Jaya");
		driver.findElement(By.id("inputLastName")).sendKeys("Bhate");
		driver.findElement(By.id("inputEmail")).sendKeys("Bhate123rr@gmail.com");
		driver.findElement(By.id("inputPhone")).sendKeys("45362334512");
		driver.findElement(By.id("inputCompanyName")).sendKeys("Bhate&co");
		driver.findElement(By.id("inputAddress1")).sendKeys("2332, ss dr");
		driver.findElement(By.id("inputCity")).sendKeys("columbus");
		driver.findElement(By.id("stateinput")).sendKeys("OH");
		driver.findElement(By.id("inputPostcode")).sendKeys("450072");
		Select select=new Select(driver.findElement(By.id("inputCountry")));
		select.selectByVisibleText("United States");
		driver.findElement(By.id("customfield2")).sendKeys("4543342244");
		driver.findElement(By.id("inputNewPassword1")).sendKeys("shriya$123");
		driver.findElement(By.id("inputNewPassword2")).sendKeys("shriya$123");
		Thread.sleep(3000);
		WebElement el1=driver.findElement(By.xpath("//span[@class='bootstrap-switch-handle-on bootstrap-switch-success']"));
		String s=el1.getText();
		System.out.println("String s: "+s);
		//el1.clear();
		Thread.sleep(3000);
		WebElement el2=driver.findElement(By.xpath("//span[@class='bootstrap-switch-handle-off bootstrap-switch-secondary']"));
		String s2=el2.getText();
		System.out.println("String s2: "+s2);
		//driver.findElement(By.name("marketingoptin")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).submit();
		//driver.quit();
		//WebDriverWait webDriverwait=new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='bootstrap-switch-label']"))).click();
		
		
		
		
		
		
	}

}
