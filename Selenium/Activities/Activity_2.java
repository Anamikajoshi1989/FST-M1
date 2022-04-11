import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();

		driver.get("https://www.training-support.net");
		System.out.println(driver.getTitle());
		WebElement id=driver.findElement(By.id("about-link"));
		System.out.println(id);
		WebElement className=driver.findElement(By.className("green"));
		System.out.println(className);
		WebElement linkText=driver.findElement(By.linkText("About Us"));
		System.out.println(linkText);
		WebElement cssText=driver.findElement(By.cssSelector(".green"));	
		
		System.out.println(cssText);
		
		
		
		driver.close();

	}

}
