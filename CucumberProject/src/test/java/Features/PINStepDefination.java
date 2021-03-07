package Features;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Baseclass.Base;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PINStepDefination extends Base {

	@When("user click on PIN Module")
	public void user_click_on_PIN_Module() {
		driver.findElement(By.xpath("//b[text()='PIM']")).click();

	}

	@Then("user able to see sub module and user click on Reports module")
	public void user_able_to_see_sub_module_and_user_click_on_Reports_module() {

		driver.findElement(By.xpath("//a[@id='menu_core_viewDefinedPredefinedReports']")).click();
	}

	@Then("user navigate to report page and user enter report name into text box")
	public void user_navigate_to_report_page_and_user_enter_report_name_into_text_box() {

		driver.findElement(By.className("ac_input")).sendKeys("Employee Job Details");

	}

	@And("click on search button")
	public void click_on_search_button() {
		driver.findElement(By.name("_search")).click();
	}

	@Then("user able to see report")
	public void _user_able_to_see_report() {

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(1, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);

		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("//td[text()='Employee Job Details']//ancestor::td"));
			}
		});
		String text = foo.getText();

		/*
		 * WebDriverWait wait1 = new WebDriverWait(driver, 10); String text =
		 * wait1.until( ExpectedConditions.presenceOfElementLocated(By.
		 * xpath("//td[text()='PIM Sample Report']//parent::td"))) .getText();
		 */

		String expected ="Employee Job Details";
		assertEquals(text, expected);

	}

/*	

	@When("user is click on welcome button")
	public void user_click_on_welcome_button() {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='panelTrigger']"))).click();

		
		//driver.findElement(By.xpath("//a[@class='panelTrigger']")).click();

	}

	@Then("user click on logout button and wait")
	public void user_click_on_logout_button() {

		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Logout']"))).click();

	}*/

	@Then("user able to logout")

	public void user_able_to_logout_from_application() {
		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = "https://opensource-demo.orangehrmlive.com/index.php/auth/login";
		System.out.println(currentUrl);
		assertEquals(currentUrl, expectedUrl);

	}

	@And("finaly close the browser")
	public void closeBrowser() {
		driver.close();
	}

	
}
