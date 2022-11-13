import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ReadPropertieFile {

	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties prop=new Properties();
		FileInputStream ip=new FileInputStream("C:\\Users\\bhara\\eclipse-workspace\\RCVDemo\\src\\config.properties");
		prop.load(ip);
		
		System.out.println("name: "+prop.getProperty("name"));
		String browser=prop.getProperty("browser");
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","D:\\software\\Browser Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}else if(browser.equals("FF"))
		{
			System.setProperty("webdriver.gecko.driver","D:\\software\\Browser Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
		}else if(browser.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver","D:\\software\\Browser Drivers\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}else if(browser.equals("Edge"))
		{
			System.setProperty("webdriver.edge.driver","D:\\software\\Browser Drivers\\msedgedriver.exe");
			driver=new EdgeDriver();
		}
		
		driver.get(prop.getProperty("url"));
	}

}
