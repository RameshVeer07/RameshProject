package org.unit;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass1 {
	public static WebDriver driver;
	public static Select s;

	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ramesh Veer\\eclipse-workspace\\MavenProject\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public static void launchUrl(String url) {
		driver.get(url);
	}
    
	public static void maxBrowser() {
		driver.manage().window().maximize();
	}

	public static void timeOut() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static void pageTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	public static void pageUrl() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}

	public static void fill(WebElement e, String value) {
		e.sendKeys(value);
	}

	public static void btnClick(WebElement tap) {
		tap.click();
	}
	public static void select(WebElement dd) {
		s = new Select(dd);
	}

	public static void byValue(String value) {
		s.selectByValue(value);
	}

	public static void byIndex(int num) {
		s.selectByIndex(num);
	}

	public static void byVisibleText(String text) {
		s.selectByVisibleText(text);
	}
	public static String readFromExcel(int rowNo, int cellNo) throws IOException {
		// 1.File Location:
		File f = new File("C:\\Users\\Ramesh Veer\\eclipse-workspace\\DataDriven\\excelbook\\excelworkdata.xlsx");
        // 2.Read from File:
		FileInputStream fin = new FileInputStream(f);
		return null;
		
	}




	

}

