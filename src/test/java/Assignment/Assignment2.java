package Assignment;

import org.testng.annotations.Test;
import DevasevaObjectRepository.VerifyProfilePage;
import GenericUtility.DevasevaBaseClass;

public class Assignment2 extends DevasevaBaseClass{
	@Test
	public void loginTest() {
		
		VerifyProfilePage verifyProfilePage=new VerifyProfilePage(driver);
		verifyProfilePage.getSkipbtn().click();
		System.out.println("Home page should be displayed");
		//verifyProfilePage.getProfileTab().click();
		
		driver.tap(1,946,2079,500);
		System.out.println("Phone no text field should be displayed");
		verifyProfilePage.getPhoneNumbertxt().sendKeys("8972328656");
}
}
