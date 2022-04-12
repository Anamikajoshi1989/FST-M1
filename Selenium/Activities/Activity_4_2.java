import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();

		driver.get("https://training-support.net/selenium/simple-form");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Anamika");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Joshi");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("anamikajoshi25@gmail.com");
		driver.findElement(By.xpath("//input[@id='number']")).sendKeys("7775979574");
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.close();		

	}

}
