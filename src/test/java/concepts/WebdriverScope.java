package concepts;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverScope {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "//Users//mac//Downloads//chromedriver");
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// This will return number of links on the entire page
		System.out.println(Driver.findElements(By.tagName("a")).size());

		// This is a scoped driver called footerdriver, who's scope is limited to the
		// footer
		WebElement footerDriver = Driver.findElement(By.id("gf-BIG"));
		System.out.println(footerDriver.findElements(By.tagName("a")).size());

		// This is another scoped driver, who's scope is limited to a column in the
		// Footer
		WebElement ColumnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(ColumnDriver.findElements(By.tagName("a")).size());

		String clickOnLinkTab = Keys.chord(Keys.COMMAND, Keys.ENTER); // This combines, a key-press and click in one
																													// String

		for (int i = 1; i < ColumnDriver.findElements(By.tagName("a")).size(); i++) {
			ColumnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
		}
		Thread.sleep(5000);

		Set<String> IDS = Driver.getWindowHandles(); // Concept from window handling
		Iterator<String> ITS = IDS.iterator();

		// .hasNext condition is important, it checks if next index is present
		while (ITS.hasNext()) { 
			Driver.switchTo().window(ITS.next());
			System.out.println(Driver.getTitle());
		}
	}
}