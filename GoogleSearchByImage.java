package sample.sel.mini_project.interim;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Interim {


	public static void main(String[] args) throws  IOException, InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
//		maximizing window
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		clicking image 
		
		driver.findElement(By.xpath("//a[@aria-label='Search for Images (opens a new tab)']")).click(); //images

	    
//		clicking on image icon	    
	    
	    driver.findElement(By.xpath("//div[@class=\"nDcEnd\"]")).click(); 
	    
	  
//		uploading file/image(click)
	    
	    driver.findElement(By.xpath("//span[ @class = 'DV7the']"));

	    
//	    selection_of_image
	    WebElement fileInput = driver.findElement(By.xpath("//input[@type='file']"));
//	    fileInput.sendKeys("C:\\Users\\Hp\\Pictures\\Screenshots\\Cognizant.jpg");
		fileInput.sendKeys("C:\\Users\\2263071\\OneDrive - Cognizant\\Pictures\\Screenshots\\Cognizant.jpg");
		
//		Clicking of find image resource
		driver.findElement(By.xpath("//a[@jsname='hSRGPd']")).click();
		
//		window handler
		Set<String> handle = driver.getWindowHandles();
		Iterator<String> rj = handle.iterator();
		String parentwindowid=rj.next();
		
		String childwindowid=rj.next();
		
		driver.switchTo().window(childwindowid);

//		Validating message
		WebElement topleft=driver.findElement(By.xpath("//div[@id='result-stats']"));
		String message= topleft.getText();
		System.out.println("message displayed on the top left: "+message);
		
//		click tool 
		driver.findElement(By.xpath("//div[@id='hdtb-tls']")).click();
		Thread.sleep(5000);
		
//		click time and then choose custom range
		driver.findElement(By.xpath("//div[contains(text(),'Any time')]")).click();
		driver.findElement(By.xpath("//div[@jscontroller=\"VD4Qme\"]")).click();
		
//		send values for date
		driver.findElement(By.xpath("//input[@id='OouJcb']")).sendKeys("04-01-2023");
		driver.findElement(By.xpath("//input[@id='rzG2be']")).sendKeys("04-30-2023");
		
//		click GO
		driver.findElement(By.xpath("//g-button[@jsaction='hNEEAb']")).click();
		
//		Validating message
		WebElement topleft1=driver.findElement(By.xpath("//*[@id=\"tn_1\"]/span[1]/g-popup/div[1]/div/div/div"));
		String message1= topleft1.getText();
		System.out.println("Date range displayed on the top left: "+message1);

//      To validate the links in the page
//		
//		WebElement links=driver.findElement(By.tagName("a")); //anchor tag
//		System.out.println("No of Links:" + links.getSize());		
		

//      To take a screenshot
		
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		File firstsrc = screenshot.getScreenshotAs(OutputType.FILE);
		File dest = new File ("./screenshot/img.png");

		FileHandler.copy(firstsrc, dest);
		
		//driver.quit();
				 
		
	}
		

}
