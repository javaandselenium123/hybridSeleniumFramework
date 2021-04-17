package popPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillRaryLoginPage {

	@FindBy(xpath="//a[text()=' GEARS ']")
	 private WebElement gearsbtn;
	
	@FindBy(xpath="(//a[text()=\" SkillRary Demo APP\"])[2]")
	private WebElement demoapp;
	
	public SkillRaryLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

    public void gearsButton()
    {
    	gearsbtn.click();
    }

   public void SkillRaryDemoApp()
   {
	   demoapp.click();
   }
}
