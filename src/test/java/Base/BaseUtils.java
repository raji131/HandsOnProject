package Base;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseUtils {
	public static WebDriver driver;
	
	public static WebDriverWait wait;
	
	public void LaunchApplication() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public void waitVisibleElement(WebElement Element) {
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(Element));
	}
	public void waitVisibleElementList(List <WebElement> Element) {
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElements(Element));
	}
	
	public void popuphandling(WebElement Element) {
		try {
			waitVisibleElement(Element);
			Element.click();
		}
		catch(Exception e){
			System.out.println("pop up not found");
			
		}
	}
	
	public void EnterText(WebElement element,String Text) {
		element.sendKeys(Text,Keys.ENTER);
	}
	
	public void click(WebElement element) {
		waitVisibleElement(element);
		element.click();
	}
	
	public void PrintAllProduct(List<WebElement> ElementList) {
		for(WebElement Element:ElementList) {
			System.out.println(Element.getText());
			
		}
	}
	public void QuitBrowser() {
		if(driver!=null) {
			driver.quit();
		}
	}
}
