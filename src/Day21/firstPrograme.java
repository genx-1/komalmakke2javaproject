package Day21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firstPrograme {

	public static void main(String[] args) {
	
			// TODO Auto-generated method stub
			//System.setProperty("webdriver.edge.driver", "C:\\Users\\Komal\\git\\repository5\\GenxSolution\\Binery\\msedgedriver letest.exe");
			
			//EdgeDriver driver = new EdgeDriver();
			// driver = new EdgeDriver();
			WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
		String pageSource = driver.getPageSource();
			System.out.println(pageSource);
			
			
			
			
			
			
			
			
			
			
			
			
			
			//validate point "Google"
			/*String ActTitle = driver.getTitle();
			
			if (ActTitle.equals("Google")) {
				System.out.println("Test Passed");
			}
			else
			{
				System.out.println("Test fail");
			}
			
			driver.quit();
			*/
			
		/*	driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("Dharashiv");	*/
			
			
			
			
			
			
			
			
			
			
			
	}

}
