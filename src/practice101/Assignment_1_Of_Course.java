package practice101;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import java.util.List;


public class Assignment_1_Of_Course {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//input[@value='option1']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//input[@value='option1']")).isSelected());
		if(driver.findElement(By.xpath("//input[@value='option1']")).isSelected() == true)
		{
			System.out.println("The checkbox got checked");
		}
		else
			System.out.println("The checkbox didn't got checked");
		driver.findElement(By.xpath("//input[@value='option1']")).click();
		Assert.assertFalse(driver.findElement(By.xpath("//input[@value='option1']")).isSelected());
		if(driver.findElement(By.xpath("//input[@value='option1']")).isSelected() == false)
		{
			System.out.println("The checkbox got unchecked");
		}
		else
			System.out.println("The checkbox is still checked");
		List<WebElement> checkboxes = driver.findElements(By.xpath("//*[@type='checkbox']"));
		System.out.println("The totle number of checkboxes in the web page are = "+checkboxes.size());
		driver.quit();
	}

}
