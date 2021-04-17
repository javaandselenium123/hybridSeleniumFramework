package popPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumTrainingPage {

	@FindBy(id="add")
	private WebElement addbtn;
	
	public WebElement getAddbtn() {
		return addbtn;
	}
	
	@FindBy(xpath="//button[text()=\" Add to Cart\"]")
	private WebElement addtocartbtn;
	
	public SeleniumTrainingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void addtoCartbutton()
	{
		addtocartbtn.click();
	}
    
	


}
