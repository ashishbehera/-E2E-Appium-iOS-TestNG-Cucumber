package pageObjects;

import java.awt.*;
import java.util.List;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class UIKitCatalogAlert {

	protected AppiumDriver<?> driver;
	public UIKitCatalogAlert(AppiumDriver<?> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
		
	}
	
	@iOSXCUITFindBy(id="Alert Views")
	public IOSElement alertViews;

	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name='Text Entry']"	)
	public IOSElement txtEntryLink;

	@iOSXCUITFindBy(xpath="//XCUIElementTypeCell")
	public IOSElement txtEntry;

	@iOSXCUITFindBy(id="OK")
	public IOSElement btnOK;

	@iOSXCUITFindBy(id="Confirm / Cancel")
	public IOSElement confirmOrCancelLink;

	@iOSXCUITFindBy(xpath="//*[contains(@name,'message')]")
	public IOSElement getMessage;

	@iOSXCUITFindBy(id="Confirm")
	public IOSElement btnConfirm	;
	;









}
