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

public class ManageReview {

	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\seleniumdownloads\\seleniumdrivers\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver(); 
			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			Properties prop = new Properties();
			

			FileInputStream Input = new FileInputStream("C:\\Users\\User\\eclipse-workspace\\practice\\orangehrm\\src\\orangehrm\\ManageReviewData.properties");
			prop.load(Input);
			String url = prop.getProperty("url");
			String userTextbox =prop.getProperty("Username_text");
			String userData = prop.getProperty("Username_Data");
			String passwordText = prop.getProperty("Password_text");
			String passwordData =prop.getProperty("Password_Data");
			String Login = prop.getProperty("Login_Button");
			String performancePage = prop.getProperty("Performance_page");
			String manageReviews = prop.getProperty("Managereviews");
			String employeeText = prop.getProperty("EmployeeTextbox");
			String employeeValue =prop.getProperty("Employeevalue");
			String review = prop.getProperty("Reviwer");
			String reviewValue =prop.getProperty("Reviwervalue");
			String addButton = prop.getProperty("Addbutton");
			String employee = prop.getProperty("Employee");
			String employeeName = prop.getProperty("Employeename");
			String supervisor = prop.getProperty("Supervisor");
			String supervisorValue = prop.getProperty("supervisorValue");
			String activateButton = prop.getProperty("activate");
			String reviews = prop.getProperty("myreviews");
			String employeereview = prop.getProperty("/html[1]/body[1]/div[1]/div[1]/div[1]/header[1]/div[2]/nav[1]/ul[1]/li[2]/ul[1]/li[3]/a[1]");
			String employeeReviewText = prop.getProperty("Employe_reveiw_text");
			String employeeReviewValue =prop.getProperty("Employee_review_value");
			String jobTitle =prop.getProperty("jobtitle");
			String subUnit =  prop.getProperty("subunit");
			String search = prop.getProperty("search");
			
			driver.get(url);
			driver.findElement(By.xpath(userTextbox)).sendKeys(userData);
			driver.findElement(By.xpath(passwordText)).sendKeys(passwordData);
			driver.findElement(By.xpath(Login)).click();
			driver.findElement(By.xpath(performancePage)).click();
			driver.findElement(By.xpath(manageReviews)).click();
			driver.findElement(By.xpath(employeeText)).sendKeys(employeeValue);
			driver.findElement(By.xpath(review)).sendKeys(reviewValue);
			driver.findElement(By.xpath(addButton)).click();
			driver.findElement(By.xpath(employee)).sendKeys(employeeName);
			driver.findElement(By.xpath(supervisor)).sendKeys(supervisorValue);
			driver.findElement(By.xpath(activateButton)).click();
			driver.navigate().back();
			Thread.sleep(2000);
			driver.navigate().back();
			driver.findElement(By.xpath(reviews)).click();
			driver.navigate().back();
			driver.findElement(By.xpath(employeereview)).click();
			driver.findElement(By.xpath(employeeReviewText)).sendKeys(employeeReviewValue);
			WebElement value = driver.findElement(By.xpath(jobTitle));
			Select obj = new Select(value);
			obj.selectByValue("Account Assistant");
			WebElement value1 = driver.findElement(By.xpath(subUnit));
			Select obj1 = new Select(value1);
			obj1.selectByValue("Engineering");
			driver.findElement(By.xpath(search)).click();
			driver.navigate().back();
			Thread.sleep(2000);
			driver.navigate().back();
		}catch (Exception e) {
			System.out.println(e.getMessage());
			
			
		}

	}


		

	}
			
			
			
			
			
			
			
			
			
			
			
		


