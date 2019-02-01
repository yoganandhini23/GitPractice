package LearningNewProGit.Gitlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Googleit {

	public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chrome\\chromedriver.exe");
		 
		// Initialize browser
		WebDriver driver=new ChromeDriver();
		 
		// Open facebook
		driver.get("http://www.google.com");
		 
		// Maximize browser
		 
		//driver.manage().window().maximize();
		System.out.println("HelloRaja");
		
		 WebElement element = driver.findElement(By.name("q"));
         element.sendKeys("Cheese!");
         element.submit();

	}

}
