package ExceptionHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElements_Exception {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.pavantestingtools.com/");
	
	WebElement link = driver.findElement(By.xpath("//a[text()='Online Training']"));
	link.click();
	Thread.sleep(20000);
driver.navigate().back();


try {
link.click();
}
catch (StaleElementReferenceException e) {
	 link = driver.findElement(By.xpath("//a[text()='Online Training']"));
	link.click();
}
	
}
}
