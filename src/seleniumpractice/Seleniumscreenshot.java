package seleniumpractice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Seleniumscreenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des = new File ("C:\\Users\\User\\eclipse-workspace\\nightpractice\\src\\seleniumpractice\\Seleniumscreenshot.jpg");
		FileHandler.copy(scr,des);

	}

}
