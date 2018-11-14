package com.wat.automation.util;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @file WidgetManagerUtil.java
 * @package com.wat.automation.util
 * @author Bharath Durga
 * @Date Nov 13, 2018
 * @Description TODO
 */
public class WidgetManagerUtil {
	private WebDriver webDriver;

	public WidgetManagerUtil(WebDriver webDriver) {
		super();
		this.webDriver = webDriver;
	}
	/**
	 *
	 * @methodName getWebElement
	 * @returns WebElement
	 * @param locator
	 * @param identifierType
	 * @return
	 */
	public WebElement getWebElement(String locator, String identifierType) {
		WebElement element = null;
		if (identifierType.equals("css")) {
			element = webDriver.findElement(By.cssSelector(locator));
		} else if (identifierType.equals("xpath")) {
			element = webDriver.findElement(By.xpath(locator));
		}else if(identifierType.equals("id")){
			element = webDriver.findElement(By.id(locator));
		}else if(identifierType.equals("tagName")){
			element = webDriver.findElement(By.tagName(locator));
		}else if(identifierType.equals("name")){
			element = webDriver.findElement(By.name(locator));
		}
		return element;
	}
	/**
	 *
	 * @methodName getWebElement
	 * @returns WebElement
	 * @param webElement
	 * @param locator
	 * @param identifierType
	 * @return
	 */
	public WebElement getWebElement(final WebElement webElement,String locator, String identifierType) {
		WebElement element = null;
		if (identifierType.equals("css")) {
			element = webElement.findElement(By.cssSelector(locator));
		} else if (identifierType.equals("xpath")) {
			element = webElement.findElement(By.xpath(locator));
		}else if(identifierType.equals("id")){
			element = webElement.findElement(By.id(locator));
		}else if(identifierType.equals("tagName")){
			element = webElement.findElement(By.tagName(locator));
		}else if(identifierType.equals("name")){
			element = webElement.findElement(By.name(locator));
		}
		return element;
	}

	/**
	 *
	 * @methodName getWebElements
	 * @returns List<WebElement>
	 * @param locator
	 * @param identifierType
	 * @return
	 */
	public List<WebElement> getWebElements(String locator, String identifierType) {
		List<WebElement> elements = null;
		if (identifierType.equals("css")) {
			elements = webDriver.findElements(By.cssSelector(locator));
		} else if (identifierType.equals("xpath")) {
			elements = webDriver.findElements(By.xpath(locator));
		}else if(identifierType.equals("id")){
			elements = webDriver.findElements(By.id(locator));
		}else if(identifierType.equals("tagName")){
			elements = webDriver.findElements(By.tagName(locator));
		}else if(identifierType.equals("name")){
			elements = webDriver.findElements(By.name(locator));
		}
		return elements;
	}

	/**
	 *
	 * @methodName getWebElements
	 * @returns List<WebElement>
	 * @param webElement
	 * @param locator
	 * @param identifierType
	 * @return
	 */
	public List<WebElement> getWebElements(final WebElement webElement,String locator, String identifierType) {
		List<WebElement> elements = null;
		if (identifierType.equals("css")) {
			elements = webElement.findElements(By.cssSelector(locator));
		} else if (identifierType.equals("xpath")) {
			elements = webElement.findElements(By.xpath(locator));
		}else if(identifierType.equals("id")){
			elements = webElement.findElements(By.id(locator));
		}else if(identifierType.equals("tagName")){
			elements = webElement.findElements(By.tagName(locator));
		}else if(identifierType.equals("name")){
			elements = webElement.findElements(By.name(locator));
		}
		return elements;
	}

	/**
	 *
	 * @methodName webElementClick
	 * @returns void
	 * @param webElement
	 */
	public void webElementClick(final WebElement webElement) {
		if (webElement != null) {
			webElement.click();
		}
	}

	/**
	 *
	 * @methodName getWebElementText
	 * @returns String
	 * @param webElement
	 * @return
	 */
	public String getWebElementText(final WebElement webElement) {
		return webElement != null ? webElement.getText() : null;
	}

	/**
	 *
	 * @methodName waitFortheElement
	 * @returns WebElement
	 * @param webElement
	 * @return
	 */
	public WebElement waitFortheElement(final WebElement webElement) {
		return (new WebDriverWait(webDriver, 10)).until(ExpectedConditions.visibilityOf(webElement));
	}

	/**
	 *
	 * @methodName waitFortheElement
	 * @returns void
	 */
	public  void waitFortheElement() {
		webDriver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	}


	/**
	 *
	 * @methodName waitFortheElement
	 * @returns void
	 * @param selector
	 */
	public void waitFortheElement(final String selector) {
		new FluentWait<WebDriver>(webDriver)
		.withTimeout(Duration.ofSeconds(30))
		.pollingEvery(Duration.ofSeconds(10))
		.until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver wd) {
				System.out.println("Bharth Durga");
				WebElement element = wd.findElement(By.cssSelector(selector));
				System.out.println("Bharth Durga  "+element.isDisplayed());

				return element.isDisplayed();
			}
		});
	}

	/**
	 *
	 * @methodName waitforthePageToLoad
	 * @returns void
	 * @param waitTime
	 */
	public void waitforthePageToLoad(long waitTime) {
		try {
			Thread.sleep(waitTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}



}
