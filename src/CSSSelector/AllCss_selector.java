package CSSSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllCss_selector {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		
		//tag id        tag#id
		//driver.findElement(By.cssSelector("input#small-searchterms"));
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-shirt");
		
		//tag class     tag.classname
		//driver.findElement(By.cssSelector("input.search-box-text "));
		//driver.findElement(By.cssSelector(".search-box-text ")).sendKeys("T-shirt");
		
		//tag attribute     [attribute = value]
		
		//driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("T-shirt");
		//driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("T-shirt");
		
		//tag class attribute   
		
		driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("T-shiert");
		
	}
}
