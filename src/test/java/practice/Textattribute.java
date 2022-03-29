package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Textattribute {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.hdfcbank.com/");
		driver.switchTo().frame("img-fluid lg_img");
		//String windowID=driver.getWindowHandle();
		//System.out.println(windowID);
		//driver.findElement(By.xpath("//img[@class='img-fluid lg_img']"));
		//String WindowID1=driver.getWindowHandle();
		//System.out.println(WindowID1);
		driver.switchTo().defaultContent();
	
		driver.findElement(By.xpath("//div[@class='drp1']//div[@class='dropdown']")).click();
		
		
		/*System.out.println(emailinputbox.getAttribute("value"));
		WebElement loginn = driver.findElement(By.xpath("//div[@class='page-title']//h1"));
		System.out.println(loginn.getText());*/
		
		//Select droselect = new Select(emailinputbox);
		//droselect.selectByVisibleText("Australia");
		
		List<WebElement> producttype=driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
		System.out.println("number of options: "+producttype.size());
		GenericMethod(producttype, "Accounts");
		
		/*for(WebElement product:producttype) {
			if(product.getText().equals("Accounts")) {
				product.click();
				break;
			}
		}*/
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//div[@class='drp2']//div[@class='dropdown']")).click();
		List<WebElement> productt=driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']/li"));
		System.out.println("number of options: "+productt.size());
		GenericMethod(productt, "Salary Accounts");
	}
		public static void GenericMethod(List<WebElement> options, String value) {
		for(WebElement produc:options) {
			if(produc.getText().equals(value)) {
				produc.click();
				break;
			}
		}
	}

}

