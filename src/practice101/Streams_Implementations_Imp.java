package practice101;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Streams_Implementations_Imp {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.xpath("//tr/th[1]")).click();
		List <String> price;
		do {
			List<WebElement> items = driver.findElements(By.xpath("//tr/td[1]"));
			
			price = items.stream().filter(s -> s.getText().contentEquals("Rice")).map(s-> findPrice(s)).collect(Collectors.toList());
			price.forEach(s-> System.out.println("The price for the vegitable Rice is = "+s));
			
			if(price.size()<1)
			{
				driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
			}
			
		}while(price.size()<1);
		
		
		

	}

	private static String findPrice(WebElement s) 
	{
		String price = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return price;
	}

}
