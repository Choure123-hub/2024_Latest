package CalenderDate;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HowTo_SelectDate_Calender {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
	
	driver.findElement(By.id("datepicker")).click();
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='ui-datepicker-calendar']")));
	
	
	String aMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
	String aYear = driver.findElement(By.className("ui-datepicker-year")).getText();
	while(!(aMonth.equals("July")  && aYear.equals("2024")))
	{
		driver.findElement(By.xpath("//a[@data-handler='next']")).click();
		aMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
		
		aYear = driver.findElement(By.className("ui-datepicker-year")).getText();
	}
	driver.findElement(By.xpath("//td[@data-handler='selectDay']/a[text()='10']")).click();
    
}
}
