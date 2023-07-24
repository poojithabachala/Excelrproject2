package orangehrm;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyTracker {

	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\seleniumdownloads\\seleniumdrivers\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver(); 
			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			Properties prop = new Properties();
			

			FileInputStream Input = new FileInputStream("C:\\Users\\User\\eclipse-workspace\\practice\\orangehrm\\src\\orangehrm\\MyTrackerData.properties");
			prop.load(Input);
			String url = prop.getProperty("url");
			String userTextbox =prop.getProperty("Username_text");
			String userData = prop.getProperty("Username_Data");
			String passwordText = prop.getProperty("Password_text");
			String passwordData =prop.getProperty("Password_Data");
			String Login = prop.getProperty("Login_Button");
			String performancePage = prop.getProperty("Performance_page");
			String myTracker = prop.getProperty("mytracker");
			String view = prop.getProperty("view");
			String addLog = prop.getProperty("addlog");
			String log = prop.getProperty("log");
			String logData = prop.getProperty("logdata");
			String save = prop.getProperty("Save");
			String employeeTracker = prop.getProperty("EmployeeTracker");
			String employee = prop.getProperty("employee");
			String employeeName = prop.getProperty("employeeName");
			String search = prop.getProperty("search");
			driver.get(url);
			driver.findElement(By.xpath(userTextbox)).sendKeys(userData);
			driver.findElement(By.xpath(passwordText)).sendKeys(passwordData);
			driver.findElement(By.xpath(Login)).click();
			driver.findElement(By.xpath(performancePage)).click();
			driver.findElement(By.xpath(myTracker)).click();
			driver.findElement(By.xpath(view)).click();
			driver.findElement(By.xpath(addLog)).click();
			driver.findElement(By.xpath(log)).sendKeys(logData);
			driver.findElement(By.xpath(save)).click();
			driver.navigate().back();
			Thread.sleep(2000);
			driver.navigate().back();
			driver.findElement(By.xpath(employeeTracker)).click();
			driver.findElement(By.xpath(employee)).sendKeys(employeeName);
			driver.findElement(By.xpath(search)).click();
			
			
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
			
			
		}
		

	}

}
