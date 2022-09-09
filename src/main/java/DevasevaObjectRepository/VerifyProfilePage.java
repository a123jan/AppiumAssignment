package DevasevaObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class VerifyProfilePage {
	@FindBy(xpath="//android.view.View[@content-desc=\"Skip\"]")
	private WebElement Skipbtn;
	@FindBy(xpath="//android.widget.ImageView[@content-desc=\"Profile Tab 4 of 4\"]")
	private WebElement ProfileTab;
	@FindBy(xpath="//android.view.View[@content-desc=\"Verify Phone Number Please enter a Phone Number to continue\"]/android.widget.EditText")
	private WebElement PhoneNumbertxt;
	
	
	public VerifyProfilePage(AndroidDriver<WebElement> driver) {
		PageFactory.initElements(driver,this);
	}



	public WebElement getSkipbtn() {
		return Skipbtn;
	}



	public WebElement getProfileTab() {
		return ProfileTab;
	}



	public WebElement getPhoneNumbertxt() {
		return PhoneNumbertxt;
	}


}
