package Day21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferentxPath {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		//xpath with single attribute
		//driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Poone");

		
		//xpath with single attribute
		//driver.findElement(By.xpath("//textarea[@class='gLFyf'][@aria-owns='Alh6id']")).sendKeys("Mumbai");
		
		//xpath with AND & OR operator
		//xpath with AND operator for and operator both attribute should be correct.
		//driver.findElement(By.xpath("//textarea[@class='gLFyf' and @aria-owns='Alh6id']")).sendKeys("Mumbai");
		
		
	//xpath with OR operator ,For "or" operator one the  of both attribute should be correct.
	//driver.findElement(By.xpath("//textarea[@class123='gLFyf' or @aria-owns='Alh6id']")).sendKeys("Mumbai");
	
	//when both attribute are wrong for or orperator it shows exception (NoSuchElementException)
	//driver.findElement(By.xpath("//textarea[@class123='gLFyf' or @aria-owns='Alh6id']")).sendKeys("Mumbai");
	
	
	//xpath with innerText()
	//some time innertext available for linktext()
		//driver.findElement(By.xpath("//*[text()='हिन्दी']")).click();
		//driver.findElement(By.xpath("//*[text()='English']")).click();
		
	//<a href="https://www.google.com/setprefs?sig=0_3S5hl_MwMiFiuQoiDoE-ys5aup0%3D&amp;hl=hi&amp;source=homepage&amp;sa=X&amp;ved=0ahUKEwjj4KunvZqKAxVkePUHHYmMI1UQ2ZgBCCE">हिन्दी</a>
	//LinkText = yes
	//InnerText  = yes
	
	//<div>welcome</div>
	//LinkText = no
		//InnerText  = yes
	
		
	//xpath with contain	
	//driver.findElement(By.xpath("//textarea[contains(@aria-controls,'Alh6')]")).sendKeys("Nagpur");
	//in the contain method we use attribute name and total or partial value of attribute
		
		
		
	//xpath with starts-with
		//driver.findElement(By.xpath("//textarea[starts-with(@aria-controls,'Alh6')]")).sendKeys("Nagpur");
		//in the contain method we use attribute name and total or partial value of attribute
			
		
		//handling dynamic element(which changes on page loading)
		//start and stop are the condition of any button and it changes dynamically
		// button = start
		// button = stop 
		//1) using and & or operation
		//*[@id='start' or @id='stop']
		//2)using cotain method
		//*[contains(@button,'st')]
		//3)using starts-with
		//*[starts-with(@button,'st')]
		
		//for dynamic element by checking behaviour of element we can use any above sutaible method to handle it.
		
		//ex of dynamic behaviour
		//1) 1xyz, 2xyz, 3xyz, 4xyz we use contain method
		//2)101xy 101yz, 101zx we use starts-with method
		//3) 
		
		//Chained xpath :-> when xpath contain attribute and tagname then it is called as chained xpath
		//in chained xpath you can write related xpath for main node then navigate to the child by using "/"
		//div[@class='k1zIA rSk4se']/style/img
		
		
		
		//if text is not present
		//tagname[contains(text(), '')]
		
		//we can use "." instead of "text"
		//tagname[contains(.,'')]
	}

}
