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
	@FindBy(xpath="//android.widget.Button[@content-desc=\"Book A Seva\"]")
	private WebElement BookASevaLink;
	@FindBy(xpath="//android.widget.Button[contains(@content-desc,'Book A Seva')]")
	private WebElement BookASevaRsLink;
	@FindBy(xpath="//android.widget.EditText[@text='Phone Number']")
	private WebElement phnotxtfield;
	@FindBy(xpath="//android.widget.Button[@content-desc=\"Continue\"]")
	private WebElement continuebtn;
	@FindBy(xpath="//android.widget.TextView[contains(@text,'code is:')]")
	private WebElement massagecode;
	@FindBy(xpath="//android.view.View[@content-desc=\"Phone Verification Enter your 4 digit code here\"]/android.view.View[2]")
	private WebElement Verificationcodebtn;
	public VerifyCampaignsPage(AndroidDriver<WebElement> driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getSkipbtn() {
		return Skipbtn;
	}

	public WebElement getCampaignsLink() {
		return CampaignsLink;
	}
	
	public WebElement getBookASevaLink() {
		return BookASevaLink;
	}

	public WebElement getBookASevaRsLink() {
		return BookASevaRsLink;
	}

	public WebElement getPhnotxtfield() {
		return phnotxtfield;
	}

	public WebElement getContinuebtn() {
		return continuebtn;
	}

	public WebElement getMassagecode() {
		return massagecode;
	}

	public WebElement getVerificationcodebtn() {
		return Verificationcodebtn;
	}
	
}
