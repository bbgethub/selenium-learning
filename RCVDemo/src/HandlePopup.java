
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;


public class HandlePopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\software\\Browser Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.convertflow.com/call-to-action/judy-cart-abandonment-popup");
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> iterator=handles.iterator();
		String parentWindow=iterator.next();
		System.out.println("Parent Window :"+parentWindow);
		String childWindow=iterator.next();
		System.out.println("Child Window : "+childWindow);
		driver.switchTo().window(childWindow);
		System.out.println("Title of the child window "+driver.getTitle());
		driver.close();
		driver.switchTo().window(parentWindow);
		System.out.println("Title of the parent window "+driver.getTitle());

	}

}
