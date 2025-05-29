package Day21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceProg4 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jadeglobal.com/careers?referrer=www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//li[@id='header-menu-menu-link-contente24aa276-cf8a-42fd-b1c7-af1917a9f72b'])[1]")).click();  // click on "let's talk"
        
		driver.findElement(By.xpath("//*[@id=\"hs-eu-confirmation-button\"]")).click();
		WebElement frame = driver.findElement(By.xpath("//*[@id=\"hs-form-iframe-0\"]"));
		driver.switchTo().frame(frame);
		driver.findElement(By.id("//*[@id=\"firstname-1a3cef18-21be-47e5-aaf9-3fd26fca624a\"]")).sendKeys("Komal");
        driver.findElement(By.xpath("//*[@id=\"nav_b\"]/a/img")).click();
		driver.findElement(By.xpath("//*[@id=\"nav_b\"]/div/i")).click();
		
		//Practice for scrolling page
		driver.findElement(By.xpath("//*[@id=\"phone-1a3cef18-21be-47e5-aaf9-3fd26fca624a\"]")).sendKeys("9876543456");
		driver.findElement(By.xpath("//*[@id=\"company-1a3cef18-21be-47e5-aaf9-3fd26fca624a\"]")).sendKeys("Sintex Solution");
		driver.findElement(By.xpath("//*[@id=\"job_title__c-1a3cef18-21be-47e5-aaf9-3fd26fca624a\"]")).sendKeys("quality Analysisi");
		
		driver.findElement(By.xpath("//*[@id=\"message-1a3cef18-21be-47e5-aaf9-3fd26fca624a\"]")).sendKeys("want to Join with you");
		driver.findElement(By.xpath("//*[@id=\"LEGAL_CONSENT.subscription_type_11960612-1a3cef18-21be-47e5-aaf9-3fd26fca624a\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"hsForm_1a3cef18-21be-47e5-aaf9-3fd26fca624a\"]/div[2]/div[2]/input")).click();
		
		
		
	}

}
