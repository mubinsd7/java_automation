package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browsertest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.findElement(By.id("small-searchterms")).sendKeys("iphone13");
		List<WebElement>links=driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
		System.out.println("Number of list elements : "+links.size());
for(WebElement ele:links) {
	System.out.println(ele.getText());
	System.out.println(links.indexOf(ele));
}
	}

}
