package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumscolldown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		WebElement a = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		Point b = a.getLocation();
		System.out.println(b);
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("scroll(200,1100)");
		Thread.sleep(3000);
		js.executeScript("scroll(0,-1100)");
		
		

	}

}
