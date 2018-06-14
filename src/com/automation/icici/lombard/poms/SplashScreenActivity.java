package com.automation.icici.lombard.poms;

import org.openqa.selenium.support.PageFactory;

import com.automation.icici.lombard.generics.BasePom;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SplashScreenActivity extends BasePom {

	public SplashScreenActivity(AndroidDriver<AndroidElement> driverMob) {
		super();
		PageFactory.initElements(new AppiumFieldDecorator(driverMob), this);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Skip']")
	private AndroidElement skipBtn;

	public void clickOnSkipButton() {
		skipBtn.click();
	}
}
