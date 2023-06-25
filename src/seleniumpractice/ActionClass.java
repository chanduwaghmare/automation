package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com/droppable");
		WebElement doubleclick = driver.findElement(By.xpath("(//a[@title='jQuery UI'])[2]"));
		Actions act = new Actions(driver);
		act.doubleClick(doubleclick).perform();
		

	}

}
