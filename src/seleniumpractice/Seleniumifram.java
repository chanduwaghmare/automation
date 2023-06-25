package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumifram {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://chercher.tech/practice/frames-example-selenium-webdriver");
		Thread.sleep(3000);
		driver.switchTo().frame("frame1");
		driver.switchTo().frame("frame2");
		driver.findElement(By.xpath("////input[@id='a']]")).click();
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//input")).sendKeys("lets play chuchu");
		Thread.sleep(3000);
		 
		

	}

}
