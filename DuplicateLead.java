package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		WebDriverManager.chromiumdriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.id("username"));
		WebElement password=driver.findElement(By.id("password"));
		WebElement login=driver.findElement(By.className("decorativeSubmit"));
		username.sendKeys("demosalesmanager");
		password.sendKeys("crmsfa");
		login.click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("NaveenRaj");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Bala");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("N");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("B");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Quality Dept");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Quality dept checks the quality of the product");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("naveenraj@gmail.com");
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select drop=new Select(state);
		drop.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println(driver.getTitle());
		//click on duplicate lead
		driver.findElement(By.className("subMenuButton")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("infosys");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("B.NAVEENRAJ");
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println(driver.getTitle());


	}

}
