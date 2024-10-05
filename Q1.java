package Task9;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Q1 {

	public static void main(String[] args) {
	       
		WebDriver driver=new FirefoxDriver();   // Creates  an object of FirefoxDriver
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();    // Maximize the window
		driver.navigate().to("http://google.com");
		System.out.println(driver.getCurrentUrl());
		driver.navigate().refresh();            // Refresh the current page
		driver.close();                         // Closing the browser automatically
	}

}
