package july8th9th_Seleniumweb;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PramitaGhosh\\Documents\\SeleniumLib\\latestSeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		//get the title under construction 
		String underconstitle="Under Construction: Mercury Tours";
		List<WebElement> links=driver.findElements(By.tagName("a"));
		String[] linktext=new String[links.size()];
		int i=0;
		for(WebElement e:links) {
			linktext[i]=e.getText();
			System.out.println(linktext[i]);
			i++;
		}
		//test whether link is working
		for(String t:linktext) {
			driver.findElement(By.linkText(t)).click();
			if(driver.getTitle().equals(underconstitle))
				System.out.println("\""+t+"\""+ "is underconstruction");
			else System.out.println("\""+t+"\""+ "is working");
			driver.navigate().back();
		}

	}

}
