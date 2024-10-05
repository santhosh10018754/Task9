package Task9;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Q3 {

public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();     // Creates an object of FirefoxDriver
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.wikipedia.org/");
		driver.manage().window().maximize();    // Maximize the window
		driver.findElement(By.name("search")).sendKeys("Artificial Intelligence");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.name("search")).sendKeys("History");
		driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
		Thread.sleep(1500);
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();                         // Closing the browser automatically
	}

}
