package popPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillRaryDemoLogin {

	@FindBy(id="course")
	private WebElement coursetab;
	
	public WebElement getCoursetab() {
		return coursetab;
	}
	
	@FindBy(xpath="(//a[text()='Selenium Training'])[2]")
	private WebElement seleniumtraining;
	
	public SkillRaryDemoLogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	 public void seleniumTrainingbtn()
	 {
		 seleniumtraining.click();
	 }

}
