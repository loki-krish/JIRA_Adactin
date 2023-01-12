package com.main.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {

	public static WebDriver driver;	
	
	// WebDriver Methods:
	
	public static void url (WebDriver d, String url) {
		d.get(url);
	}
	
	public static void title (WebDriver d) {
		d.getTitle();
	}
	
	public static void current_Url (WebDriver d) {
		d.getCurrentUrl();
	}
	
	public static void close (WebDriver d) {
		d.close();
	}
	
	public static void quit (WebDriver d) {
		d.quit();
	}
	
	// Navigation Commands:
	
	public static void navigate_Url (WebDriver d, String url) {
		d.navigate().to(url);
	}
	
	public static void back (WebDriver d) {
		d.navigate().back();
	}
	
	public static void refresh (WebDriver d) {
		d.navigate().refresh();
	}
	
	public static void forward (WebDriver d) {
		d.navigate().forward();
	}
	
	// Manage Commands:
	
	public static void maximize (WebDriver d) {
		d.manage().window().maximize();
	}
	
	public static void minimize (WebDriver d) {
		d.manage().window().minimize();
	}
	
	public static void full_Screen (WebDriver d) {
		d.manage().window().fullscreen();
	}
	
	public static void del_AllCookies (WebDriver d) {
		d.manage().deleteAllCookies();
	}
	
	// Browser Launch
	
	public static WebDriver browser_Launch (String browser) {
		
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", 
					"//Users//loki//Downloads//chromedriver");
			ChromeOptions options = new ChromeOptions ();
			options.addArguments("incognito");
			driver = new ChromeDriver(options);	
			
		} else if (browser.equals("mozilla")) {
			System.setProperty("webdriver.firefox.driver", "path");
			driver = new FirefoxDriver();

		} else if (browser.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "path");
			driver = new EdgeDriver();
			
		} else {
			System.out.println("Invalid Browser");
		}
		
		return driver;	
	}
	
	// WebElement Methods:
	
	public static void click (WebElement element) {
		element.click();
	}
	
	public static void send_Keys (WebElement element, String value) {
		element.sendKeys(value);
	}
	
	public static void clear (WebElement element) {
		element.clear();
	}
	
	public static void get_Text (WebElement element) {
		element.getText();
	}
	
	public static void is_Displayed (WebElement element) {
		element.isDisplayed();
	}
	
	public static void is_Enabled (WebElement element) {
		element.isEnabled();
	}
	
	public static void is_Selected (WebElement element) {
		element.isSelected();
	}
	
// Dropdown Methods:
	
	public static void is_Multiple (WebElement element) {
		Select s = new Select (element);
		boolean multiple = s.isMultiple();
		System.out.println("Is dropdown multiple: "+multiple);
	}
	
	public static void selectby_Index (WebElement element, int index) {
		Select s = new Select (element);
		s.selectByIndex (index);
	}
	
	public static void selectby_Value (WebElement element, String value) {
		Select s = new Select (element);
		s.selectByValue(value);
	}
	
	public static void selectby_Visibletext (WebElement element, String text) {
		Select s = new Select (element);
		s.selectByVisibleText(text);
	}
	
	public static void deselectby_Index (WebElement element, int index) {
		Select s = new Select (element);
		s.deselectByIndex(index);
	}
	
	public static void deselectby_Value (WebElement element, String value) {
		Select s = new Select (element);
		s.deselectByValue(value);
	}
	
	public static void deselectby_Visibletext (WebElement element, String text) {
		Select s = new Select (element);
		s.deselectByVisibleText(text);
	}
	
	public static void get_Options (WebElement element) {
		Select s = new Select (element);
		List<WebElement> all_Options = s.getOptions();
		for (WebElement all : all_Options) {
			System.out.println("List of All Options: "+all);
		}	
	}
	
	public static void selected_Options (WebElement element) {
		Select s = new Select (element);
		List <WebElement> all_SelectedOptions = s.getAllSelectedOptions();
		for (WebElement all : all_SelectedOptions) {
			System.out.println("List of all Selected Options: "+all);
		}
	}
	
	public static void first_SelectedOption (WebElement element) {
		Select s = new Select (element);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println("First Selected Option: "+firstSelectedOption);
	}
	
	public static void deselect_All (WebElement element) {
		Select s = new Select (element);
		s.deselectAll();
	}
	
	// Actions (Mouse)
	
	public static void click (WebDriver d, WebElement element) {
		Actions a = new Actions (d);
		a.click().build().perform();
	}
	
	public static void right_Click (WebDriver d, WebElement element) {
		Actions a = new Actions (d);
		a.contextClick(element).build().perform();
	}
	
	public static void moveto_Element (WebDriver d, WebElement element) {
		Actions a = new Actions (d);
		a.moveToElement(element).build().perform();
	}
	
	// Robot (Keyboard Actions)
	
	public static void down (WebElement element) throws AWTException {
		Robot r = new Robot ();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}
	
	public static void enter (WebElement element) throws AWTException {
		Robot r = new Robot ();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	// Timeouts
	
	public static void implicit_Wait (WebDriver d) {
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	// Alert
	
	public static void accept_Alert (WebDriver d) {
		Alert a = d.switchTo().alert();
		a.accept();
	}
	
	public static void dismiss_Alert (WebDriver d) {
		Alert a = d.switchTo().alert();
		a.dismiss();
	}
	
	// Window Handling
	
//		public static void switch_WindowHandle (WebDriver d) {
			
//		}
		
}
