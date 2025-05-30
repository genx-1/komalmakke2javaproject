package Day28;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandles {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");
        driver.manage().window().maximize();
        	//driver.get("https://www.nopcommerce.com/");
 driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
        	Set<String> windoweids = driver.getWindowHandles();
        List<String> windolist = new ArrayList(windoweids);
        	
        	/*String parenid = windolist.get(0);
        	String childid = windolist.get(1);
        	System.out.println(driver.getTitle());
        	driver.switchTo().window(childid);
        	System.out.println(driver.getTitle());
        	driver.switchTo().window(parenid);
        	System.out.println(driver.getTitle());*/
        	//********************************************************
        	//Aproach 2
        	for (String win : windoweids) {
        		String title = driver.switchTo().window(win).getTitle();
        		if(title.equals("OrangeHRM")) {
        			System.out.println(driver.getCurrentUrl());
        		}
        	}
        	
        	
	}

}
