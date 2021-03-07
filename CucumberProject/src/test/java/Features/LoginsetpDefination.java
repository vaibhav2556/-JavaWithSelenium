package Features;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Baseclass.Base;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginsetpDefination extends Base {

	public static String openUrl = "https://opensource-demo.orangehrmlive.com/";

	@Given("user available on login page")
	public void user_available_on_login_page() {

		init(openUrl);
	}

	@When("user enter {string}")
	public void user_enter_Username(String username) {
		driver.findElement(By.id("txtUsername")).sendKeys(username);

	}

	@When("user  are enter {string}")
	public void user_are_enter(String password) {
		driver.findElement(By.id("txtPassword")).sendKeys(password);

	}

	@When("user click on login button")
	public void click_on_login_button() {
		driver.findElement(By.id("btnLogin")).click();
	}

	@Then("user  navigate to home page")
	public void user_navigate_to_home_page() {

		String title = driver.getTitle();
		System.out.println(title);
		String expected = "OrangeHRM";
		assertEquals(title, expected);

	}

	@When("user click on welcome button")
	public void user_click_on_welcome_button() {

		driver.findElement(By.xpath("//a[@class='panelTrigger']")).click();

	}

	@Then("user click on logout button")
	public void user_click_on_logout_button() {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Logout']"))).click();

	}

	@Then("user able to logout from application")

	public void user_able_to_logout_from_application() {
		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = "https://opensource-demo.orangehrmlive.com/index.php/auth/login";
		System.out.println(currentUrl);
		assertEquals(currentUrl, expectedUrl);

	}

	@And("close the browser")
	public void closeBrowser() {
		driver.close();
	}

}
