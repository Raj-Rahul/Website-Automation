package sample.sel.practice.p1;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class BookMyShow {

//	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		WebDriver c=new ChromeDriver();
		Actions action = new Actions(c);
		
		c.manage().window().maximize();
		c.get("http://www.google.com");
	    c.findElement(By.name("q")).sendKeys("Bookmyshow");
	    Thread.sleep(1000);
//		google_search
	    c.findElement(By.xpath("//input[@class='gNO89b']")).click();
	    Thread.sleep(2000);
	    
//      Retrieve WebElement 'google search' to perform mouse hover 
    	WebElement mo = c.findElement(By.xpath("/html/body/div[7]/div/div[11]/div/div[2]/div[2]/div/div/div[1]/div/div/div/div/div/div/div/div[1]/a/h3"));
//      Mouse hover menuOption 
    	action.moveToElement(mo);
    	action.click().perform();
	    Thread.sleep(5000);
//      c.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    c.findElement(By.xpath("/html/body/div[6]/div/div/div/div[2]/ul/li[3]/div/div/img")).click();
	    Thread.sleep(5000);
	   
	    c.findElement(By.xpath("//*[@id=\"super-container\"]/div[2]/div[3]/div[1]/div[1]/div/div/div/div[2]/div/div[2]")).click();
	    Thread.sleep(4000);
	    
	    //Movie_selection(The Pope's Exorcist)
	    
	    c.findElement(By.xpath("//div[@class='sc-7o7nez-0 noqMC' and text()='Horror/Thriller']")).click();
	    Thread.sleep(3000);
	    
	    //click_booktickets
	    
	    c.findElement(By.xpath("//*[@id=\"page-cta-container\"]/button")).click();
	    Thread.sleep(6000);
	    
	    //remove_popup
	    
	    c.findElement(By.xpath("//button[@id='wzrk-cancel']")).click();
	    Thread.sleep(2000);
	    
	    //Date_selection
	    
	    //arrow
	    c.findElement(By.xpath("//button[@class='buttons next slick-arrow']")).click();
	    Thread.sleep(2000);
	    
	    c.findElement(By.xpath("//button[@class='buttons next slick-arrow']")).click();
	    Thread.sleep(2000);
	    //click_date
	    c.findElement(By.xpath("//li[@class='date-details  slick-slide' and @data-slick-index='2']")).click();
	    Thread.sleep(2000);
	    
	    //Movie_time
	    c.findElement(By.xpath("//a[@class='showtime-pill' and @data-date-time='10:00 PM']")).click();
	    Thread.sleep(2000);
	    
	    //T&C_accept
	    c.findElement(By.xpath("//div[@id='btnPopupAccept' and @class='bar-btn _primary']")).click();
	    Thread.sleep(2000);
	    
        c.findElement(By.xpath("//div[@id='proceed-Qty']")).click();
	    Thread.sleep(2000);
//	    c.findElement(By.xpath("//div[@id='proceed-Qty']")).click();
//	    Thread.sleep(2000);
//	    c.findElement(By.xpath("//div[@id='proceed-Qty']")).click();
//	    Thread.sleep(2000);
//	    c.findElement(By.xpath("//div[@id='proceed-Qty']")).click();
//	    Thread.sleep(2000);
	}



}
