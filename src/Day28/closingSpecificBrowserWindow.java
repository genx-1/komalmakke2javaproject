package Day28;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class closingSpecificBrowserWindow {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");
        driver.manage().window().maximize();
       driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
        	Set<String> windoweids = driver.getWindowHandles();
        	//List<String> windolist = new ArrayList(windoweid);
        	for (String win :windoweids)
        	{
        	String title = driver.switchTo().window(win).getTitle();
        	System.out.println(title);
        	
        	if (title.equals("Human Resources Management Software | OrangeHRM HR Software")  || title.equals("Some other title"))
        	{
        		driver.close();
        	}
        	}
//Human Resources Management Software | OrangeHRM HR Software
	}

}
