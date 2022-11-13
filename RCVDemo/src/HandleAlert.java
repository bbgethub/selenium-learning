import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class HandleAlert {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\software\\Browser Drivers\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		//maximize window
	      driver.manage().window().maximize();
	      driver.manage().deleteAllCookies();
	      driver.findElement(By.name("proceed")).click();
	      Thread.sleep(5000);
	      Alert alert=driver.switchTo().alert();
	      System.out.println(alert.getText());
	      String str=alert.getText();
	      if(str.equals("Please enter a valid user name"))
	    	  alert.accept();
	      else
	    	  System.out.println("invalid alert");
	     
	}

}
