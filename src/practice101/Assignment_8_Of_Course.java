package practice101;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Assignment_8_Of_Course {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement autoDropdown = driver.findElement(By.id("autocomplete"));
//		autoDropdown.click();
		autoDropdown.sendKeys("uni");
		List<WebElement>  options= driver.findElements(By.xpath("//div[@class='ui-menu-item-wrapper']"));
		for(int i=0;i<6; i++)
		{
			autoDropdown.sendKeys(Keys.chord(Keys.ARROW_DOWN));
			String option = options.get(i).getText();
			if(option.contains("United States (USA)"))
			{
				System.out.println("The value displayed in the Auto Complete Dropddown is = "+ autoDropdown.getAttribute("value"));
				options.get(i).click();
				File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(src, new File("D://Selenium_Screenshots/test" + System.currentTimeMillis()+ ".png"));
			}
			
		}
		

	}

}
