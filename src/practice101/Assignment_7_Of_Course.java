package practice101;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_7_Of_Course {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> rows = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr"));
		System.out.println("The Total Rows in the table is = "+rows.size());
		
		//List<WebElement> columns =driver.findElements(By.xpath("//table[@name='courses']/tbody/tr[3]/td"));
		List<WebElement> columns = rows.get(2).findElements(By.tagName("td"));
		System.out.println("The Total Columns in the table is = "+columns.size());
		
		for(int i=0;i<columns.size();i++)
		{
			System.out.println("The value in 2nd row and column "+(i+1)+" is = "+ columns.get(i).getText());
		}
		

	}

}
