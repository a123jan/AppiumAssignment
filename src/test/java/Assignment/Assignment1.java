package Assignment;

import org.testng.annotations.Test;

import DevasevaObjectRepository.VerifyCampaignsPage;
import GenericUtility.DevasevaBaseClass;

public class Assignment1 extends DevasevaBaseClass {
	@Test
	public void campaignsTest() throws InterruptedException {
		
		VerifyCampaignsPage verifyCampaignsPage=new VerifyCampaignsPage(driver);
		verifyCampaignsPage.getSkipbtn().click();
		System.out.println("Home page should be displayed");
		
		for(int i=0;i<2;i++) {
			Thread.sleep(5000);
			driver.swipe(553, 2005, 553, 586,500);
		}
		verifyCampaignsPage.getCampaignsLink().click();
		System.out.println("Featured campaigns page shpould be displayed");
		verifyCampaignsPage.getBookASevaLink().click();
		Thread.sleep(5000);
		driver.swipe(553, 1500, 553, 586,500);
		verifyCampaignsPage.getBookASevaRsLink().click();
		verifyCampaignsPage.getPhnotxtfield().sendKeys("7892020861");
		verifyCampaignsPage.getContinuebtn().click();
		driver.openNotifications();
		Thread.sleep(5000);
	    String code=verifyCampaignsPage.getMassagecode().getText();
		String[] eachcose = code.split(":");
		System.out.println(code);
		driver.launchApp();
}
}
