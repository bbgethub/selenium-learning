import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demodropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\software\\Browser Drivers\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/dropdown");
		Select select=new Select(driver.findElement(By.id("dropdown")));
		select.selectByIndex(1);
	}

}
