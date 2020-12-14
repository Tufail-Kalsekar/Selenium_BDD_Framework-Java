package concepts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class alertsHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tufae\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
	
		//This will set the URL 
		Driver.get("https://rahulshettyacademy.com/AutomationPractice/"); 
		
		Driver.findElement(By.id("name")).sendKeys("Tufail");
		Driver.findElement(By.id("alertbtn")).click();
		
		String PopUp1 = Driver.switchTo().alert().getText();
		Assert.assertEquals(PopUp1, "Hello Tufail, share this practice page and share your knowledge");
		
		Driver.switchTo().alert().accept();
		System.out.println("Script Complete");
	}

}
