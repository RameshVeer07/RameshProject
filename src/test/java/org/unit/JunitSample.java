package org.unit;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitSample extends BaseClass1 {

	@BeforeClass
	public static void launch() {
		launchBrowser();
	}

	@Test
	public void tc1() {
		launchUrl("http://adactinhotelapp.com/");
	}

	@Test
	public void tc2() {
		maxBrowser();
	}

	@Test
	public void tc3() {
		timeOut();
	}

	@Test
	public void tc4() {
		pageTitle();
	}

	@Test
	public void tc5() {
		pageUrl();
	}

	@Test
	public void tc6() {
		WebElement user = driver.findElement(By.id("username"));
		fill(user, "9595959595");
	}

	@Test
	public void tc7() {
		WebElement pass = driver.findElement(By.id("password"));
		fill(pass, "1234567890");

	}

	@Test
	public void tc8() {
		WebElement login = driver.findElement(By.id("login"));
		btnClick(login);
	}

	@Test
	public void tc9() throws InterruptedException {
		Thread.sleep(2000);

	}

	@Test
	public void tc10() {
		WebElement loc = driver.findElement(By.id("location"));
		select(loc);
		byVisibleText("Adelaide");

	}

	@Test
	public void tc11() {
		WebElement hotel = driver.findElement(By.id("hotels"));
		select(hotel);
		byIndex(3);

	}

	@Test
	public void tc12() {
		WebElement room = driver.findElement(By.id("room_type"));
		select(room);
		byValue("Double");
	}

	@Test
	public void tc13() {
		WebElement submit = driver.findElement(By.id("Submit"));
		btnClick(submit);
	}

	@Test
	public void tc14() throws InterruptedException {
		Thread.sleep(2000);

	}

	@Test
	public void tc15() {
		WebElement btnRad = driver.findElement(By.id("radiobutton_0"));
		btnClick(btnRad);
	}

	@Test
	public void tc16() {
		WebElement cont = driver.findElement(By.id("continue"));
		btnClick(cont);
	}
	@Test
	public void tc17() {
		WebElement firstName = driver.findElement(By.id("first_name"));
		fill(firstName, "Ramesh");
	}
	@Test
	public void tc18() {
		WebElement lastName = driver.findElement(By.id("last_name"));
		fill(lastName, "Veer");
	}
	
	
	

}
