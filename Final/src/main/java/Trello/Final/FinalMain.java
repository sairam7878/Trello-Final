package Trello.Final;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FinalMain {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		//driver = new ChromeDriver();
		driver.get("https://trello.com/home");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));

		WebElement Login = driver.findElement(By.linkText("Log in"));
		Login.click();
		
		driver.findElement(By.cssSelector("#user")).sendKeys("pillisairam78@gmail.com");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//WebElement password = driver.findElement(By.cssSelector("#password"));
		//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("#password")));
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#password")).sendKeys("Sairam@78");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#login-submit")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//p[@class='szBTSFrvPTLGHM'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@data-testid='header-create-board-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='nch-textfield__input lsOhPsHuxEMYEb lsOhPsHuxEMYEb VkPAAkbpkKnPst']")).sendKeys("Q A Assignment 5");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Create')]")).click();
		
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//span[@class='placeholder']")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input[placeholder='Enter list title…']")).sendKeys("list 8");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input[placeholder='Enter list title…']")).sendKeys("list 9");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
        
	driver.findElement(By.xpath("(//a[@aria-label='Cancel list editing'])[1]")).click();
	 Thread.sleep(2000);
	 Thread.sleep(2000);
     driver.findElement(By.xpath("(//span[contains(text(),'Add a card')])[1]")).click();
     Thread.sleep(2000);
     
     driver.findElement(By.xpath("//textarea[@placeholder='Enter a title for this card…']")).sendKeys("card 1");
     Thread.sleep(2000);
     driver.findElement(By.xpath("//input[@type='submit']")).click();
     Thread.sleep(2000);
     driver.findElement(By.xpath("//a[@class='icon-lg icon-close dark-hover js-cancel']")).click();
     Thread.sleep(2000);
     driver.findElement(By.xpath("(//span[contains(text(),'Add a card')])[2]")).click();
     driver.findElement(By.xpath("//textarea[@placeholder='Enter a title for this card…']")).sendKeys("card 2");
     Thread.sleep(2000);
     driver.findElement(By.xpath("//input[@type='submit']")).click();
     Thread.sleep(2000);
     driver.findElement(By.xpath("//a[@class='icon-lg icon-close dark-hover js-cancel']")).click();
     Actions actions = new Actions(driver);
     Thread.sleep(5000);
     List<WebElement> atag = driver.findElements(By.cssSelector(".list-card.js-member-droppable.ui-droppable"));
     WebElement a1 = atag.get(0);
     a1.getAttribute("href");
     WebElement a2 = atag.get(1);
     String a1string = a1.getAttribute("href");
     String a2string= a2.getAttribute("href");
   //  System.out.println(a1string+""+a2string);
     
       WebElement source = a1;
       WebElement destination = a2;

       actions.dragAndDrop(source, destination).build().perform();
       Point finalPosition = destination.getLocation();
       int finalX = finalPosition.getX();
       int finalY = finalPosition.getY();
       System.out.println(finalX+"---"+finalY);

	}

}
