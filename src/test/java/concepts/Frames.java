package concepts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//Users//mac//Downloads//chromedriver");
		WebDriver Driver = new ChromeDriver();
		
		//URL to get
		Driver.get("https://the-internet.herokuapp.com/nested_frames");
		
		Driver.switchTo().frame(Driver.findElement(By.name("frame-top")));
		Driver.switchTo().frame(Driver.findElement(By.name("frame-middle")));
		
		System.out.println(Driver.findElement(By.id("content")).getText());
		
	}

}
