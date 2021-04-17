package genericlibrary;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class WebDriverUtilities {
public void dropDown(WebElement ele, String text)
{
	Select s= new Select(ele);
	s.selectByVisibleText(text);
}

public void mouseOver(WebDriver driver, WebElement target)
{
	Actions a = new Actions(driver);
	a.moveToElement(target).perform();
}

public void frame(WebDriver driver)
{
	driver.switchTo().frame(0);
}

public void switchBackframe(WebDriver driver)
{
	driver.switchTo().defaultContent();
}

public void alertPopup(WebDriver driver)
{
	driver.switchTo().alert().accept();
}

public void dismissalertPopup(WebDriver driver)
{
	driver.switchTo().alert().dismiss();
}

public void switchTabs(WebDriver driver)
{
	Set<String> child = driver.getWindowHandles();
	for(String b:child)
	{
		driver.switchTo().window(b);
		
	}
}

public void doubleClick(WebDriver driver, WebElement target)
{
	Actions a =new Actions(driver);
	a.doubleClick(target).perform();
}

public void scrollBar(WebDriver driver, int x, int y)
{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy("+x+","+y+")");
}

public void verify(String actual, String expected)
{
	Assert.assertEquals(actual, expected);
}
}
