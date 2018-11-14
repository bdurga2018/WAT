package com.wat.automation.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * @file BrowserUtil.java
 * @package com.wat.automation.util
 * @author Bharath Durga
 * @Date Nov 13, 2018
 * @Description All Browser Related Helper Methods
 */
public class BrowserUtil {
	private static final String BIN_CHROMEDRIVER = "/usr/local/bin/chromedriver";
	private static final String BIN_GECKODRIVER = "/usr/local/Cellar/geckodriver/0.23.0/bin/geckodriver";

	/**
	 *
	 * @methodName getFireFoxDriver
	 * @returns WebDriver
	 * @return
	 */
	public static WebDriver getFireFoxDriver(){
		System.setProperty("webdriver.gecko.driver", BIN_GECKODRIVER);
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		return driver;
	}

	/**
	 *
	 * @methodName getChromDriver
	 * @returns WebDriver
	 * @return
	 */
	public static  WebDriver getChromDriver(){
		System.setProperty("webdriver.chrome.driver", BIN_CHROMEDRIVER);
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeOptions options = new ChromeOptions();
		options.setCapability(ChromeOptions.CAPABILITY, capabilities);
		WebDriver driver = new ChromeDriver(options);
		return driver;
	}
}


