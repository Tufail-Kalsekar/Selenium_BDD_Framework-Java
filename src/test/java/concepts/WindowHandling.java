package concepts;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "//Users//mac//Downloads//chromedriver");
		WebDriver Driver = new ChromeDriver();

		Driver.get("https://www.gmail.com/");
		Driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/footer[1]/ul[1]/li[2]/a[1]")).click();

		// Print current window in focus
		System.out.println(Driver.getTitle());

		// At this point 2 windows are open. (parent and child)
		// To switch the windows, we need to get IDs of the windows open.
		// The method, Driver.getWindowHandles will put all the IDs of the open windows,
		// only in a Set of String type
		// From here on, we try to iterate to the correct ID. By default the Iterator
		// will point to a null location
		// in the Set, upon giving .next method it will move to the first (by default -
		// parent) ID, and thereon to the first open window then the second

		Set<String> IDS = Driver.getWindowHandles();
		Iterator<String> ITS = IDS.iterator();

		String ParentID = ITS.next();
		String ChildID = ITS.next();

		Driver.switchTo().window(ChildID);
		System.out.println(Driver.getTitle());

		Driver.switchTo().window(ParentID);
		System.out.println(Driver.getTitle());

		System.out.println("End of Script");
	}

}
