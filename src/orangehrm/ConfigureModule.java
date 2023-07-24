package orangehrm;

import java.io.FileInputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;

public class ConfigureModule {

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
			String configurePage = prop.getProperty("Configure_button");
			String configureKpi =prop.getProperty("Configure_Kpi");
			
			
			String kpi = prop.getProperty("Kpi");
			
			String addButton = prop.getProperty("Add_button");
			
			String keyPerformanceIndicator = prop.getProperty("Keyperformance_indicator");
			String keyValue = prop.getProperty("key_value");
			String minimumRate =prop.getProperty("minimumrate");
			String maximumRate =prop.getProperty("maximumrate");
			String minimumValue =prop.getProperty("minimumratevalue");
			String maximumvalue =prop.getProperty("maximumratevalue");
			String defalutScale = prop.getProperty("Defaultscale");
			
			driver.get(url);
			//new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
			driver.findElement(By.xpath(userTextbox)).sendKeys(userData);
			
			driver.findElement(By.xpath(passwordText)).sendKeys(passwordData);
			driver.findElement(By.xpath(Login)).click();
			//new WebDriverWait(driver, 100).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Performance']")));
			driver.findElement(By.xpath(performancePage)).click();
		    driver.findElement(By.xpath(configurePage)).click();
		    List<WebElement> list = driver.findElements(By.xpath(configureKpi));
			
			Iterator<WebElement> iterator = list.iterator();
			while (iterator.hasNext()) {
				WebElement Element  =(WebElement)iterator.next();
				System.out.println(Element.getText());
				
				}
			driver.findElement(By.xpath(kpi)).click();
			driver.findElement(By.xpath(addButton)).click();
			driver.findElement(By.xpath(keyPerformanceIndicator)).sendKeys(keyValue);
			driver.findElement(By.xpath(minimumRate)).clear();
			driver.findElement(By.xpath(minimumRate)).sendKeys(minimumValue);
			driver.findElement(By.xpath(maximumRate)).clear();
			driver.findElement(By.xpath(maximumRate)).sendKeys(maximumvalue);
			driver.findElement(By.xpath(defalutScale)).click();
			driver.navigate().back();
		}catch (Exception e) {
			System.out.println(e.getMessage());
			
			
		}

	}

}
			
			
		    
		    
		   
		
		
           
			
			
			
			
			
					
			
			
			
			
			
			
			
			
			
		
				
				
			
			
			
		
			
			
			
			

			
		
