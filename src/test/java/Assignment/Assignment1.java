package Assignment;

import org.openqa.selenium.By;
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
		String[] eachcode = code.split(":");
		System.out.println(code);
		System.out.println(eachcode[1]);
		Thread.sleep(5000);
		 driver.swipe(553, 1500, 553, 586,500);
		 Thread.sleep(5000);
		//verifyCampaignsPage.getVerificationcodebtn().sendKeys(eachcode[1]);
		//driver.tap(1, 220, 1080, 500);
		setnumber(eachcode[1].substring(0,1));
		setnumber(eachcode[1].substring(1,2));
		setnumber(eachcode[1].substring(2,3));
		setnumber(eachcode[1].substring(3,4));
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Submit\"]")).click();
}
	public String setnumber(String number) {


		switch (number) {

		case "1":
		{
			driver.tap(1, 146, 1791, 500);
			break;
		}
		case "2":
		{
			driver.tap(1, 406, 1791, 500);
			break;
		}
		case "3":
		{
			driver.tap(1, 670, 1791, 500);
			break;
		}
		case "4":
		{
			driver.tap(1, 146, 1937, 500);
			break;
		}
		case "5":
		{
			driver.tap(1, 406, 1937, 500);
			break;
		}
		case "6":
		{
			driver.tap(1, 670, 1937, 500);
			break;
		}
		case "7":
		{
			driver.tap(1, 146, 2058, 500);
			break;
		}
		case "8":
		{
			driver.tap(1, 406, 2058, 500);
			break;
		}
		case "9":
		{
			driver.tap(1, 670, 2058, 500);
			break;
		}
		default:
		{
			System.out.println("case not matched");
			break;
		}

		}
		return number;

	}
	
}
