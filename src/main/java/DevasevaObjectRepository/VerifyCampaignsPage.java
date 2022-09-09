package DevasevaObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class VerifyCampaignsPage {
	@FindBy(xpath="//android.view.View[@content-desc=\"Skip\"]")
	private WebElement Skipbtn;
	@FindBy(xpath="//android.widget.Button[@content-desc=\"View all Campaigns\"]")
	private WebElement CampaignsLink;
	
	
	
	public VerifyCampaignsPage(AndroidDriver<WebElement> driver) {
		PageFactory.initElements(driver,this);
	}



	public WebElement getSkipbtn() {
		return Skipbtn;
	}



	public WebElement getCampaignsLink() {
		return CampaignsLink;
	}
	

}
