import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoAutomation {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\software\\Browser Drivers\\Chrome102\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		//FirefoxDriver driver=new FirefoxDriver();
		//WebDriver driver=new EdgeDriver();
		driver.get("https://signup.ebay.com/pa/crte?siteid=0&co_partnerId=0&UsingSSL=1&rv4=1&ru=https%3A%2F%2Fwww.ebay.com%2F&signInUrl=https%3A%2F%2Fwww.ebay.com%2Fsignin%3Fsgn%3Dreg%26siteid%3D0%26co_partnerId%3D0%26UsingSSL%3D1%26rv4%3D1%26ru%3Dhttps%253A%252F%252Fwww.ebay.com%252F");
		//driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Tom");
		driver.findElement(By.id("firstname")).sendKeys("Tom");
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Kam");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("tomkam@gmail.com");		
		driver.findElement(By.cssSelector("#password")).sendKeys("tomkamand$123");
		//driver.findElement(By.linkText("Sign in")).click();
	}

}
