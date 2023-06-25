package seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniummethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.getCurrentUrl();
		
		driver.navigate().to("https://www.godaddy.com/");
		driver.quit();
		
		
		
		

	}

}
