package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example5 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://testautomationpractice.blogspot.com/");
	String text = driver.findElement(By.xpath("//table[@name='BookTable']//tr[3]//td[4]")).getText();
	System.out.println(text);
}
}
