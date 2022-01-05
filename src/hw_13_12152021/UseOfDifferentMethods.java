package hw_13_12152021;
/* Also use isDisplayed(), isEnabled(), isSelected(), getTitle(), getCurrentUrl(), getText(), sendKeys() methods for the existing work in HW 13. You can also choose more than one url to see those actions. Please push it to github*/
import org.openqa.selenium.By;
/*03) Use testNG annotation to create method to run an URL. Also use maximize(), fullscreen(), deleteAllCookies(), get (), sleep(), click(), quit() methods for your chosen URL. You can also choose more than one url to see those actions. Please push it to github*/
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UseOfDifferentMethods {
     WebDriver driver;
	@BeforeTest
	public void setUp() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arvin\\eclipse-workspace\\HomeWorkOctober2021\\drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	}
	@Test(priority = 1)
	public void getMethod() {
		driver.get("https://www.libertymutual.com/");
	}
	@Test(priority = 2)
	public void maximizeOrFullscreenMethod() {
		//driver.manage().window().maximize();
		driver.manage().window().fullscreen();
	}
	@Test(priority = 3)
	public void deleteAllCookiesMethod() {
		driver.manage().deleteAllCookies();
	}
	@Test(priority = 4)
	public void sleepMethod() throws InterruptedException {
		Thread.sleep(3000);
	}
	@Test(priority = 5)
	public void clickMethod() throws InterruptedException {
		driver.findElement(By.xpath("(//button[@class='jsx-1441356085 lm-ClickDropdown--button'])[1]")).click();
	}
	
	@AfterTest
	public void tearUp() {
		driver.quit();
	}
	
	

	
	
	
}
