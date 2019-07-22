package july8th9th_Seleniumweb;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class July9thDemo2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\PramitaGhosh\\Documents\\SeleniumLib\\latestSeleniumSoftware\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.navigate().to("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		WebElement e = driver.findElement(By.name("userName"));
		if (e.isEnabled()) {
			e.sendKeys("sunil");
			e.clear();
			e.sendKeys("sunil");
			System.out.println("Username entered");
		}
		Thread.sleep(3000);

		// to fetch the value entered in edit field
		System.out.println("Text entered is: " + driver.findElement(By.name("userName")).getAttribute("value"));
		System.out.println(
				"Attribute @name for the element is: " + driver.findElement(By.name("userName")).getAttribute("name"));
		System.out.println("Getting inner text for the element is: "
				+ driver.findElement(By.xpath("//*[contains(text(),'Name: ')]")).getText());
		driver.findElement(By.name("password")).sendKeys("sunil");
		driver.findElement(By.name("login")).click();
		Thread.sleep(10000);
		System.out.println("Is the element displayed: "
				+ driver.findElement(By.xpath("//*[@name='tripType' and @value='roundtrip']")).isSelected());
		Thread.sleep(3000);
		if (driver.findElement(By.xpath("//*[@name='tripType' and @value='roundtrip']")).isSelected())
			driver.findElement(By.xpath("//*[@name='tripType' and @value='oneway']")).click();

		/*
		 * WebElement DD=driver.findElement(By.name("passCount"));
		 * 
		 * Select sel=new Select(DD); List<WebElement> options=sel.getOptions();
		 * System.out.println("Passenger count options value: "+options.size());
		 * WebElement e1=sel.getFirstSelectedOption();
		 * System.out.println("First selected option is: "+e1.getAttribute("value"));
		 * for(int i=0;i<options.size();i++) {
		 * System.out.println(options.get(i).getText()); }
		 * 
		 * sel.selectByValue("2"); Thread.sleep(3000); sel.selectByVisibleText("1");
		 * Thread.sleep(3000); sel.selectByIndex(0);
		 * 
		 * if(driver.findElement(By.xpath("//*[@name='servClass' and @value='Coach']")).
		 * isSelected())
		 * driver.findElement(By.xpath("//*[@name='servClass' and @value='Business']")).
		 * click(); driver.findElement(By.name("findFlights")).click();
		 * Thread.sleep(3000); driver.findElement(By.name("reserveFlights")).click();
		 * Thread.sleep(5000);
		 * driver.findElement(By.name("passFirst0")).sendKeys("Pramita");
		 * driver.findElement(By.name("passLast0")).sendKeys("Ghosh");
		 * driver.findElement(By.name("creditnumber")).sendKeys("1234 1234 1234");
		 * 
		 * List<WebElement> checkboxes=driver.findElements(By.
		 * xpath("//*[@type='checkbox' and @name='ticketLess']"));
		 * System.out.println("Number of checkboxes"+checkboxes.size()); for(int
		 * i=0;i<checkboxes.size();i++) checkboxes.get(0).click();
		 * 
		 * for(WebElement e2:checkboxes) { e2.click(); }
		 * 
		 * Thread.sleep(3000); //driver.findElement(By.name("buyFlights")).click();
		 *
		
		
		List<WebElement> menuopt=driver.findElements(By.xpath("//td[@valign='top']//table[@bordercolor]//tr/td[2]//a"));
		System.out.println("Number of elements::"+menuopt.size());
		for(WebElement e3:menuopt) {
			Thread.sleep(5000);
			System.out.println(e3.getText()+" Link Clicked :::");
			Thread.sleep(10000);
			e3.click();
		for(int j=0;j<menuopt.size();j++) {
			menuopt.get(j).click();*/
		
		String arr[]= {"Home","Flights","Hotels","Car Rentals","Cruises","Destinations","Vacations"};
				
		for(String s1:arr) {
			
			driver.findElement(By.xpath("//*[contains(text(),'"+s1+"')]")).click();
			System.out.println(s1);
			Thread.sleep(2000);
		
		//td[@valign='top'][2]//tr[4]//img
		String attval = driver.findElement(By.xpath("//td[@valign='top'][2]//tr[4]//img")).getAttribute("src");
		if (attval.contains("construction.gif")) {
			System.out.println("The section is under construction:");

		}else
		System.out.println("The section is working fine");
		
		}

	}

}
