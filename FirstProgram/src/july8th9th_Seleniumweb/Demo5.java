package july8th9th_Seleniumweb;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Demo5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PramitaGhosh\\Documents\\SeleniumLib\\latestSeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		/*
		 * driver.navigate().to("http://newtours.demoaut.com/");
		 * driver.manage().window().maximize(); Actions MH= new Actions(driver);
		 * //Action
		 * mouseover=MH.moveToElement(driver.findElement(By.linkText("Cruises"))).build(
		 * ); //mouseover.perform();
		 * //MH.sendKeys(driver.findElement(By.linkText("Cruises")),(Keys.ENTER)).
		 * perform();
		 * //MH.sendKeys(driver.findElement(By.linkText("Cruises")),(Keys.RETURN)).
		 * perform(); Thread.sleep(3000);
		 * MH.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.RETURN).perform();
		 */
		/*driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("txtUsername")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		Actions MH= new Actions(driver); 
		MH.sendKeys(Keys.RETURN).perform();
		
		 * for(int i=0;i<3;i++) MH.sendKeys(Keys.TAB).perform();
		 * MH.sendKeys(Keys.ENTER).perform();
		 * same operation in one line below
		 
		Thread.sleep(3000);
		MH.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.RETURN).perform();*/
		
		driver.navigate().to("http://retail.upskills.in/admin/");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin@123");
		Actions MH= new Actions(driver); 
		MH.sendKeys(Keys.RETURN).perform();
		WebElement e=driver.findElement(By.xpath("//*[@id='menu-catalog']//i"));
		MH.moveToElement(e).click().perform();
		

	}

}
