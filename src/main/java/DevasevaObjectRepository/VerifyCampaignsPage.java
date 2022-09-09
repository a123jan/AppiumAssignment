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
	@FindBy(xpath="//android.widget.Button[@content-desc=\"Book A Seva - Rs.2116.00\"]")
	private WebElement BookASevaRsLink;
	@FindBy(xpath="//android.view.View[@content-desc=\"Verify Phone Number Please enter a Phone Number to continue\"]/android.widget.EditText")
	private WebElement phnotxtfield;
	@FindBy(xpath="//android.widget.Button[@content-desc=\"Continue\"]")
	private WebElement continuebtn;
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
	
}
