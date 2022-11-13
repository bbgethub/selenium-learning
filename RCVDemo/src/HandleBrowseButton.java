import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowseButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\software\\Browser Drivers\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://html.com/input-type-file/");
		//maximize window
	      driver.manage().window().maximize();
	      driver.manage().deleteAllCookies();
	      driver.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("C:/Users/bhara/Downloads/IMG_20220227_154417802.jpg");

	}

}
