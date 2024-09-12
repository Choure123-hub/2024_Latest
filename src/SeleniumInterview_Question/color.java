package SeleniumInterview_Question;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class color {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement loginbutton = driver.findElement(By.xpath("//button[@name='login']"));
	String color = loginbutton.getCssValue("color");
	System.out.println(color);
}
}
