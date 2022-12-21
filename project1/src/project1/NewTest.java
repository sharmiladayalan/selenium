package project1;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;


public class NewTest {
	
	WebDriver wb;
	  @BeforeTest
	
	public void beforeTest() throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium-java-4.7.0\\chromedriver.exe");
		 wb=new ChromeDriver();
		 wb.navigate().to(" https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 Thread.sleep(5000);
	  }
	  @Test(priority=0)
  public void login() throws InterruptedException {
	    wb.findElement(By.name("username")).sendKeys("Admin");
		wb.findElement(By.name("password")).sendKeys("admin123");
		wb.findElement(By.xpath("//*[@class=\'oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\']")).click();
		Thread.sleep(5000);
  }
	  @Test(priority=1)
  
public void Admin() throws InterruptedException  {
		wb.findElement(By.linkText("Admin")).click();
		Thread.sleep(5000);
		wb.findElement(By.linkText("Dashboard")).click();
		Thread.sleep(5000);
	 }
 @AfterTest
  public void afterTest() {
	 wb.close();
 }
}
  



