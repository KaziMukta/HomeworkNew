package hw_14_12152021;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



	public class UseOfDifferentMethods14 {
		WebDriver driver;
		@BeforeTest
		public void setupmethod() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Arvin\\eclipse-workspace\\HomeWorkOctober2021\\drivers\\chromedriver.exe");	
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.libertymutual.com/");
		Thread.sleep(5000);	
		}
		
		@Test(enabled=true,priority = 1)
		public void logotest() throws InterruptedException {
	    boolean elementdisplayed = driver.findElement(By.tagName("rect")).isDisplayed();	
		System.out.println("Is the logo displayed? Ans:"+elementdisplayed);	
		}
		
		@Test(enabled= true,priority = 2)
		public void loginButtonTest() throws InterruptedException {
		boolean loginEnabled=driver.findElement(By.xpath("//a[@class='lm-IconButton lm-IconButton--16 lm-IconButton--white']")).isEnabled();	
		System.out.println("Is the login Button Enable ? Ans:" +loginEnabled);
		}
		
		@Test(enabled = true,priority =3)
		public void customerSupportMethod()  {
		boolean cstmSupport= driver.findElement(By.xpath("(//button[@class='jsx-1441356085 lm-ClickDropdown--button'])[3]")).isSelected();	
		System.out.println("Is the checkbox selected? Ans:"+ cstmSupport);
			
		}	
			
        @Test(enabled = true,priority =4)
		public void passwordTest() throws InterruptedException {
        driver.findElement(By.xpath("//a[@class='lm-IconButton lm-IconButton--16 lm-IconButton--white']")).click();
        Thread.sleep(3000);	
        driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("abgcv");
		Thread.sleep(5000);			
		}	
       
        @Test(enabled = true,priority =5)
		public void titleTest() throws InterruptedException {
		System.out.println("The title of the page is: "+ driver.getTitle());
		Thread.sleep(3000);
        }

        @Test(enabled = true,priority =6)
		public void currentURLTest() throws InterruptedException {
		System.out.println("The current URL is: "+driver.getCurrentUrl());		
        }
		
       @Test(enabled = true,priority =7)
		public void getTextTest() {
		WebElement claims=driver.findElement(By.xpath("//input[@name='PASSWORD']"));
		System.out.println("The text for the WebElement is: " +claims.getText());
				
        } 
        @AfterTest
        public void tearUp() {
        	driver.quit();
        }
        
        
        
}