package july8th9th_Seleniumweb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo6 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\PramitaGhosh\\Documents\\SeleniumLib\\latestSeleniumSoftware\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.navigate().to("http://realestate.upskills.in/wp-admin/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.findElement(By.id("user_login")).sendKeys("admin");
		driver.findElement(By.id("user_pass")).sendKeys("adminuser@12345");
		Actions action=new Actions(driver);
		String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);
		action.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(10000);
		WebElement e=driver.findElement(By.xpath("//*[text()='Howdy, ']"));
		//action.moveToElement(e).build().perform();
		Thread.sleep(3000);
		action.contextClick(e).build().perform();
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		System.out.println("Current url title: "+driver.getTitle());
		String currenturl1=driver.getCurrentUrl();
		if (currenturl.contentEquals(currenturl1))
			System.out.println("Switched to next tab: "+currenturl1);
		

	}

}
