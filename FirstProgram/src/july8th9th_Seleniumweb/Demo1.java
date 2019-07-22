package july8th9th_Seleniumweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//to set property of gecko driver
		
		  System.setProperty("webdriver.gecko.driver",
		  "C:\\Users\\PramitaGhosh\\Documents\\SeleniumLib\\latestSeleniumSoftware\\geckodriver-v0.24.0-win64\\geckodriver.exe"
		  ); 
		  //WebDriver driver=new FirefoxDriver(); 
		  FirefoxDriver driver=new FirefoxDriver(); 
		  //driver.get("https://opensource-demo.orangehrmlive.com/");
		  driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		  driver.manage().window().maximize();
		  //Refresh webpage, a navigate method
		  Thread.sleep(5000);
		  //driver.navigate().refresh();
		  driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		  driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		  driver.findElement(By.id("btnLogin")).click();
		  Thread.sleep(5000);
		  if(driver.getTitle().equals("OrangeHRM1")) {		  
		  
		  driver.findElement(By.xpath("//*[@id='welcome']")).click();
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
		
		  } else System.out.println("Title not matched");
		 
		  driver.quit();//to close all the instances opened by webdriver
 
	}

}
