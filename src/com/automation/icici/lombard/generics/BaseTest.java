package com.automation.icici.lombard.generics;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class BaseTest {

	public static AndroidDriver<AndroidElement> driverMob;

	@BeforeClass
	public void preStartUp() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("deviceName", "Samsung s5");
		cap.setCapability("platformversion", "6.0.1");
		cap.setCapability("appPackage", "com.icicilombard.mcust");
		cap.setCapability("appActivity", "com.icicilombard.mcust.common.ui.activity.SplashScreenActivity");
		driverMob = new AndroidDriver(new URL("https://127.0.0.1:4723/wd/hub"), cap);
	}

	@AfterClass
	public void postStartUp() {
		// driverMob.quit();
	}

}
