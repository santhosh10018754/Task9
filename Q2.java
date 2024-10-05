package Task9;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.navigate().to("https://www.demoblaze.com/");
		driver.manage().window().maximize();  // Maximize the window
		
		if (driver.getTitle().equals("STORE")) {
			System.out.println("Page landed on correct website");
		} else {
			System.out.println("Page not landed on correct website");
		}
		driver.close();                         // Close the browser automatically
	}

}
