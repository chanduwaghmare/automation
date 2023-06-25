package seleniumpractice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDimension {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Dimension a = new Dimension(500,900);
		driver.manage().window().setSize(a);
		Thread.sleep(3000);
		Point b = new Point (500,950);
		driver.manage().window().setPosition(b); 
		
		
		

	}

}
