import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();

		driver.get("https://training-support.net/selenium/simple-form");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("firstName")).sendKeys("Anamika");
		driver.findElement(By.id("lastName")).sendKeys("Joshi");
		driver.findElement(By.id("email")).sendKeys("anamikajoshi25@gmail.com");
		driver.findElement(By.id("number")).sendKeys("7775979574");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.close();		
	}

}
