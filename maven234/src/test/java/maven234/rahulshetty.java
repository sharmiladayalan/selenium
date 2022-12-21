package maven234;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class rahulshetty {
	WebDriver wb;
  @Test
  public void f() throws InterruptedException {
	  wb.findElement(By.xpath("//*[@id=\"radio-btn-example\"]/fieldset/label[1]/input")).click();
	  Thread.sleep(3000);
	  wb.findElement(By.xpath("//*[@id=\"radio-btn-example\"]/fieldset/label[2]/input")).click();
	  Thread.sleep(3000);
	  wb.findElement(By.xpath("//*[@id=\"radio-btn-example\"]/fieldset/label[3]/input")).click();
	  Thread.sleep(3000);
	  wb.findElement(By.id("autocomplete")).sendKeys("India");
	  Thread.sleep(3000);
	  wb.findElement(By.id("dropdown-class-example")).click();
	  wb.findElement(By.xpath("//*[@id=\"dropdown-class-example\"]/option[2]")).click();
	  Thread.sleep(3000);
	  wb.findElement(By.xpath("//*[@id=\"dropdown-class-example\"]/option[3]")).click();
	  Thread.sleep(3000);
	  wb.findElement(By.xpath("//*[@id=\"dropdown-class-example\"]/option[4]")).click();
	  Thread.sleep(3000);
	  wb.findElement(By.id("checkBoxOption1")).click();
	  Thread.sleep(3000);
	  wb.findElement(By.id("checkBoxOption2")).click();
	  Thread.sleep(3000);
	  wb.findElement(By.id("checkBoxOption3")).click();
	  Thread.sleep(3000);
	 // wb.findElement(By.id("openwindow")).click();
	  //Thread.sleep(3000);
	 // wb.findElement(By.id("opentab")).click();
	 //Thread.sleep(3000);
	  wb.findElement(By.id("name")).sendKeys("pooja");
	  Thread.sleep(3000);
	  wb.findElement(By.id("alertbtn")).click();
	  Thread.sleep(3000);
	  Alert alt=wb.switchTo().alert();
      System.out.println("Alert:"+alt.getText());
      alt.accept();
      Thread.sleep(3000);
	  wb.findElement(By.id("confirmbtn")).click();
	  Thread.sleep(3000);
	  System.out.println("Alert:"+alt.getText());
	  alt.accept();
	  Thread.sleep(3000);
	  wb.findElement(By.xpath("/html/body/div[3]/div[1]/fieldset/legend")).click();
	  Thread.sleep(3000);
	  wb.findElement(By.id("hide-textbox")).click();
	  Thread.sleep(3000);
	  wb.findElement(By.id("show-textbox")).click();
	  Thread.sleep(3000);
	  wb.findElement(By.xpath("/html/body/div[3]/div[2]/fieldset[2]/div[1]")).click();
	  Thread.sleep(3000);
	  wb.findElement(By.id("mousehover")).click();
	  Thread.sleep(3000);
	  WebElement dr=wb.findElement(By.xpath("/html/body/div[4]/div/fieldset/div/div/a[1]"));
	  Actions act=new Actions(wb);
	  Thread.sleep(3000);
	  act.moveToElement(dr).build().perform();
	  
	 WebElement ab= wb.findElement(By.xpath("/html/body/div[4]/div/fieldset/div/div/a[2]"));
	  Thread.sleep(3000);
	  act.moveToElement(ab).build().perform();
	  Thread.sleep(3000);
	  JavascriptExecutor js=(JavascriptExecutor)wb;
	List  <WebElement>frame= wb.findElements(By.tagName("iframe"));
	  System.out.println(frame);
	  Thread.sleep(3000);
	  
	 
	  
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	  wb=new ChromeDriver();
	  wb.get("https://rahulshettyacademy.com/AutomationPractice/");
  }

  @AfterTest
  public void afterTest() {
  }

}
