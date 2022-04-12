import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();

		driver.get("https://www.training-support.net");
		System.out.println("First Screen"+driver.getTitle());
		driver.findElement(By.xpath("//a[@id='about-link']")).click();
		System.out.println("Second screen"+driver.getTitle());	

	}

}
