package Assignment;

import org.testng.annotations.Test;

import DevasevaObjectRepository.VerifyCampaignsPage;
import GenericUtility.DevasevaBaseClass;

public class Assignment1 extends DevasevaBaseClass {
	@Test
	public void campaignsTest() {
		
		VerifyCampaignsPage verifyCampaignsPage=new VerifyCampaignsPage(driver);
		verifyCampaignsPage.getSkipbtn().click();
		System.out.println("Home page should be displayed");
		for(int i=0;i<2;i++) {
			driver.swipe(553, 2005, 553, 586,500);
		}
		verifyCampaignsPage.getCampaignsLink().click();
		System.out.println("Featured campaigns page shpould be displayed");
		
}
	

}
