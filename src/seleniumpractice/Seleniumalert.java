package seleniumpractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumalert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("http://demoqa.com/alerts");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		Thread.sleep(3000);
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		Thread.sleep(3000);
		

	}

}
