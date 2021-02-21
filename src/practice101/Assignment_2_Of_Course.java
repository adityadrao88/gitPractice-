package practice101;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Assignment_2_Of_Course {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");
		WebElement Adult_Dropdown= driver.findElement(By.xpath("//select[@id='Adults']"));
		Select adult = new Select(Adult_Dropdown);
		adult.selectByValue("5");
		
		WebElement Child_Dropdown = driver.findElement(By.xpath("//select[@id='Childrens']"));
		Select child = new Select(Child_Dropdown);
		child.selectByVisibleText("2");
		
		driver.findElement(By.xpath("//input[@id='DepartDate']")).click();
		driver.findElement(By.cssSelector("a[class*='ui-state-active']")).click();
		
		driver.findElement(By.xpath("//a[@id='MoreOptionsLink']")).click();
		
		driver.findElement(By.xpath("//input[@id='AirlineAutocomplete']")).sendKeys("indigo");
		
		driver.findElement(By.xpath("//input[@id='SearchBtn']")).click();
		
		Thread.sleep(4000);
		
		System.out.println(driver.findElement(By.xpath("//div[@id='homeErrorMessage']")).getText());
	}

}
