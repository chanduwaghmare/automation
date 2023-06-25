package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amezon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/ref=nav_logo");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("women protien");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='id=\"nav-search-submit-button\"]")).click();
		

	}

}
