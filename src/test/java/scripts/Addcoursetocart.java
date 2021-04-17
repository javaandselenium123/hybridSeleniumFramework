package scripts;

import org.testng.annotations.Test;

import genericlibrary.BaseClass;
import popPages.SeleniumTrainingPage;
import popPages.SkillRaryDemoLogin;
import popPages.SkillRaryLoginPage;

public class Addcoursetocart extends BaseClass {
    @Test
	public void addtocart()
{
	SkillRaryLoginPage s= new SkillRaryLoginPage(driver);
	s.gearsButton();
	s.SkillRaryDemoApp();
	
	utilities.switchTabs(driver);
	
	SkillRaryDemoLogin sd= new SkillRaryDemoLogin(driver);
	utilities.mouseOver(driver, sd.getCoursetab());
	sd.seleniumTrainingbtn();
	
	SeleniumTrainingPage st= new SeleniumTrainingPage(driver);
	utilities.doubleClick(driver, st.getAddbtn());
	st.addtoCartbutton();
	
	utilities.alertPopup(driver);
	
	
			
			
	
	
}
	
}
