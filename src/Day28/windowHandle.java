package Day28;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");
        //https://www.nopcommerce.com/
        	driver.get("https://www.nopcommerce.com/");
        	driver.navigate().back();
        	Thread.sleep(5000);
        	System.out.println(driver.getCurrentUrl());
        	driver.navigate().forward();
        	Thread.sleep(5000);
        	System.out.println(driver.getCurrentUrl());
        	Thread.sleep(5000);
        	 driver.navigate().refresh();
        	Thread.sleep(10000);
        	driver.quit();
        	
        	
        	
        	
        	
        	
	} 

}
