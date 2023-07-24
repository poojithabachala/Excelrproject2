package orangehrm;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginModule {

	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\seleniumdownloads\\seleniumdrivers\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver(); 
			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			Properties prop = new Properties();
			

			FileInputStream Input = new FileInputStream("C:\\Users\\User\\eclipse-workspace\\practice\\orangehrm\\src\\orangehrm\\Data.properties");
			prop.load(Input);
			String url = prop.getProperty("url");
			String userTextbox =prop.getProperty("Username_text");
			String userData = prop.getProperty("Username_Data");
			String passwordText = prop.getProperty("Password_text");
			String passwordData =prop.getProperty("Password_Data");
			String Login = prop.getProperty("Login_Button");
			String performancePage = prop.getProperty("Performance_page");
			driver.get(url);
			//new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
			driver.findElement(By.xpath(userTextbox)).sendKeys(userData);
			
			driver.findElement(By.xpath(passwordText)).sendKeys(passwordData);
			driver.findElement(By.xpath(Login)).click();
			//new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Performance']")));
			driver.findElement(By.xpath(performancePage)).click();
			driver.findElement(By.xpath("//span[normalize-space()='Configure']")).click();
			
			
			
			
			
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
			
			
		}
		

	}

}
