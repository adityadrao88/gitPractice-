package practice101;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

//import jdk.jfr.Timespan;

public class OrangeHRM_Assignment2 {
	static void confirm_password(String cpw, WebElement cpwtb) {
		cpwtb.clear();
		cpwtb.sendKeys(cpw);
	}

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://orangehrm-demo-6x.orangehrmlive.com/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement dropdown = driver.findElement(By.xpath("//button[@data-toggle='dropdown']"));
		dropdown.click();
		WebElement sysadm = driver.findElement(By.xpath("//a[contains(text(), 'System')]"));
		sysadm.click();
		// WebElement uname= driver.findElement(By.xpath("//input[@id='txtUsername']"));
		// uname.clear();
		// uname.sendKeys("admin");
		// WebElement pwrd=driver.findElement(By.xpath("//input[@id='txtPassword']"));
		// pwrd.clear();
		// pwrd.sendKeys("admin123");
		// WebElement login=driver.findElement(By.xpath("//input[@id='btnLogin']"));
		// login.click();

		driver.findElement(By.xpath("//span[contains(text(),'PIM')]")).click();

		/*
		 * var wait= new WebDriverWait(driver, 5);
		 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
		 * "//a[@id='menu_pim_addEmployee']")));
		 */

		driver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']")).click();
		/*
		 * var wait= new WebDriverWait(driver, 30);
		 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
		 * "//input[@id='firstName']")));
		 */
		WebElement fname = driver.findElement(By.xpath("//input[@id='firstName']"));
		fname.sendKeys("AR");

		WebElement mname = driver.findElement(By.xpath("//input[@id='middleName']"));
		mname.sendKeys("PDR");

		WebElement lname = driver.findElement(By.xpath("//input[@id='lastName']"));
		lname.sendKeys("RAO");

		WebElement location = driver.findElement(By.xpath("//input[@value='-- Select --']"));
		location.click();

		WebElement select_option = driver
				.findElement(By.xpath("//span[contains(text(),\"Indian Development Center\")]"));
		select_option.click();

		WebElement create_login_checkbox = driver.findElement(By.xpath("//label[@for='hasLoginDetails']"));
		create_login_checkbox.click();

		WebElement uname = driver.findElement(By.xpath("//input[@id='username']"));
		uname.sendKeys("AR1988");

		WebElement status = driver.findElement(By.xpath("//div[@id='status_inputfileddiv']/div/input"));
		String selected_status = status.getAttribute("value");
		System.out.println("The selected option by default is = " + selected_status);

		WebElement pword = driver.findElement(By.xpath("//input[@id='password']"));
		pword.sendKeys("Test12345");

		WebElement cpword = driver.findElement(By.xpath("//input[@id='confirmPassword']"));
		confirm_password("Test123456789", cpword);
		WebElement validation = driver.findElement(By.xpath("//span[text()=\"Passwords do not match\"]"));
		String error = validation.getText();
		System.out.println("The validation error is=" + error);
		confirm_password("Test12345", cpword);

		WebElement ess_role = driver.findElement(
				By.xpath("//div[@id='essRoleId_inputfileddiv']/div[@class='select-wrapper initialized']/input"));
		String ess = ess_role.getAttribute("value");
		System.out.println("The default options selected is in the field ESS Role is=" + ess);

		WebElement sup_role = driver.findElement(
				By.xpath("//div[@id='supervisorRoleId_inputfileddiv']/div[@class='select-wrapper initialized']/input"));
		String sup = sup_role.getAttribute("value");
		System.out.println("The default options selected is in the field ESS Role is=" + sup);

		WebElement adm_role = driver.findElement(By.xpath("//div[@id='adminRoleId_inputfileddiv']"));
		adm_role.click();
		WebElement adm_role_select = driver.findElement(By.xpath("//span[text()='Time Manager']"));
		adm_role_select.click();

		/*
		 * WebElement region =
		 * driver.findElement(By.xpath("//label[@for='allRegions']")); region.click();
		 * 
		 * WebElement country =
		 * driver.findElement(By.xpath("//div[@class='multy-select-container']"));
		 * country.click();
		 * 
		 * WebElement country_select = driver.findElement(By.xpath("//li[@id='IN']"));
		 * country_select.click();
		 */

		WebElement next=driver.findElement(By.xpath("//a[@id='systemUserSaveBtn']"));
		next.click();
		 
		WebElement blood_group= driver.findElement(By.xpath("//div[@id='1_inputfileddiv']"));
		blood_group.click();
		
		WebElement blood_group_select= driver.findElement(By.xpath("//span[text()='B']"));
		blood_group_select.click();
		
		

	}

}
