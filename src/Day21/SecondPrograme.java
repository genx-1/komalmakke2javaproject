package Day21;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SecondPrograme {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		
		
 /*Scanario 1 Locator matching with single webelement
 findElement (loc)-----> Single webelement   webelement
 findElements (loc)-----> Single webelement   List<webelement>*/
 
 //
 //WebElement linkStore = driver.findElement(By.className("gb_W"));
//	String StoreLink = linkStore.getText();
	//System.out.println(StoreLink);
//	it gives firstlink of webpage
 
 
	/*List<WebElement> linkStore = driver.findElements(By.className("gb_W"));
	System.out.println(linkStore.size());*/
	
	
	
 
/* Scanario 2 Locator matching with multi webelements
 findElement (loc)-----> Single webelement   webelement
 findElements (loc)-----> multi webelement   List<webelement>*/
 
 
 /*WebElement link1 = driver.findElement(By.tagName("a"));
	String FirstLink = link1.getText();
	System.out.println(FirstLink);*/
		
//	it gives firstlink of webpage
	
	
/* List<WebElement> links = driver.findElements(By.tagName("a"));
	System.out.println(links.size());*/

 
 
 
 
 
// Scanario 3 Locator matching with no webelements
 //findElement (loc)-----> no such element exception
 //findElements (loc)-----> it will not through any exception. Returns 0 
 
 
	/*List<WebElement> links = driver.findElements(By.tagName("k"));
		links.size();
		System.out.println(links.size());*/
		//(Provide 0 but not trough any exception because here we use list type collection so it return not found means zero)
		
		
		//WebElement link = driver.findElement(By.tagName("k"));
		
		//(No such element exception because he does not found element)
		
		
		
		
	}

}
