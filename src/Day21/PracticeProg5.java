package Day21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeProg5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		
		/*driver.get("http://zero.webappsecurity.com/");
		driver.manage().window().maximize();
		String windowid = driver.getWindowHandle();
		System.out.println("Window id "+ windowid);*/
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
	WebElement img = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img"));
	boolean result = img.isDisplayed();
	System.out.println(result);
	if (result == true) {
		System.out.println("Test case pass");
	}
	else
	{
		System.out.println("Test case fail");
	}

	}

}
