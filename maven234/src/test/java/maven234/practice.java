package maven234;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

@Test(priority=0)
public class practice {
	  WebDriver wd;
	  public String URL="https://demoqa.com/dynamic-properties";
	  public String URL1="https://demoqa.com/automation-practice-form";
	  public String URL2="https://demoqa.com/modal-dialogs";
  public void f() throws InterruptedException {
	  wd.findElement(By.xpath("//*[@id=\"enableAfter\"]")).click();
	  Thread.sleep(3000);
	  wd.findElement(By.xpath("//*[@id=\"colorChange\"]")).click();
	  Thread.sleep(3000);
	  wd.findElement(By.xpath("//*[@id=\"visibleAfter\"]")).click();
	  Thread.sleep(3000);
 }
  @Test(priority=1)
  public void test() throws InterruptedException {
	  wd.findElement(By.id("firstName")).sendKeys("pooja");
	  Thread.sleep(3000);
	  wd.findElement(By.id("lastName")).sendKeys("D");
	  Thread.sleep(3000);
	  wd.findElement(By.id("userEmail")).sendKeys("pooja23@gmail.com");
	  Thread.sleep(3000);
	  wd.findElement(By.id("gender-radio-2")).click();
	  Thread.sleep(3000);
	  wd.findElement(By.id("id=\"userNumber\"")).sendKeys("9898767890");
	  Thread.sleep(3000);
	  wd.findElement(By.id("dateOfBirthInput")).click();
	  Thread.sleep(3000);
	  wd.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select")).click();
	  Thread.sleep(3000);
	  wd.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select/option[4]")).click();
	  Thread.sleep(3000);
	  wd.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select")).click();
	  Thread.sleep(3000);
	  wd.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select/option[101]")).click();
	  Thread.sleep(3000);
	  wd.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[4]/div[2]")).click();
	  Thread.sleep(3000);
	  wd.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]")).sendKeys("computer");
	  Thread.sleep(3000);
	  wd.findElement(By.xpath("//*[@id=\"uploadPicture\"]")).sendKeys("\"C:\\Users\\pooja\\OneDrive\\Pictures\\Screenpresso\\2022-12-12_09h05_12.png\"");
	  wd.findElement(By.xpath("//*[@id=\"currentAddress\"]")).sendKeys("vellore");
	  Thread.sleep(3000);
  }
  @Test(priority=2)
  public void test1() throws InterruptedException {
	  wd.findElement(By.id("showSmallModal")).click();
	  Alert alt=wd.switchTo().alert();
      System.out.println("Alert:"+alt.getText());
      alt.dismiss();
      wd.findElement(By.id("showLargeModal")).click();
      System.out.println("Alert:"+alt.getText());
      alt.dismiss();
      
      
  }
  
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
	  wd=new ChromeDriver();
	  wd.get(URL);
	  Thread.sleep(3000);
	  wd.get(URL1);
	  Thread.sleep(3000);
	  wd.get(URL2);
	  Thread.sleep(3000);
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
