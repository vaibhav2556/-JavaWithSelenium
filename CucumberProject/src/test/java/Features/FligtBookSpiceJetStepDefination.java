package Features;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Baseclass.Base;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FligtBookSpiceJetStepDefination extends Base {

	public Select dropdown;
	public JavascriptExecutor js;

	public String openUrl = "https://www.spicejet.com/";

	@Given("user available on  book flight page")
	public void user_available_on_book_flight_page() {
		init(openUrl);

	}

	@When("user  selected  Departure city from dropdown")
	public void user_selected_Departure_city_from_dropdown() {

	/*	WebElement element = driver.findElement(By.name("ctl00_mainContent_ddl_originStation1_CTXT"));

		dropdown = new Select(element);
		dropdown.selectByVisibleText("Indore (IDR)");*/
		
	driver.findElement(By.name("ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys("Pune (PNQ)");
	
	
	}

	@Then("user able to see city must be selected")
	public void user_able_to_see_city_must_be_selected() {
		
		 String actual=driver.findElement(By.xpath("//input[@selectedtext='Pune (PNQ)']")).getAttribute("value");
		
		 String expected="Pune (PNQ)";
		 
		 assertEquals(actual, expected);

		
		
}

	@When("user Arrival city to dropdown")
	public void user_Arrival_city_to_dropdown() {
		
		driver.findElement(By.name("ctl00_mainContent_ddl_destinationStation1_CTXT")).sendKeys("Delhi (DEL)");
		
		
	}

	@When("user select date from  Depart Date  and date must be selected")
	public void user_select_date_from_Depart_Date_and_date_must_be_selected() {
		//driver.findElement(By.id("ctl00_mainContent_view_date1")).sendKeys("25/03");
			/*	lement element=	driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-active']"));

		
		 WebDriverWait wait= new WebDriverWait(driver, 20);
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathExpression))
		 
				 
	*/	
		
		 js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].value = arguments[1]",
		        driver.findElement(By.id("ctl00_mainContent_view_date1")), "25-03");
		
	}

	@When("user select date from RETURN DATE  and date must be selected")
	public void user_select_date_from_RETURN_DATE_and_date_must_be_selected() {
		
		js.executeScript("arguments[0].value = arguments[1]",
		        driver.findElement(By.id("ctl00_mainContent_view_date2")), "01-04");

}

	@When("user select Adults from Passengers dropdown and  user must se adults selected")
	public void user_select_Adults_from_Passengers_dropdown_and_user_must_se_adults_selected() {
		
		
		
		
 
		 WebDriverWait wait= new WebDriverWait(driver, 20);
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='divpaxinfo']"))).click();
		 
				 
WebElement passenger=driver.findElement(By.xpath("//select[@class='wMed1s required valid' and @id='ctl00_mainContent_ddl_Adult']"))	;			
		
		dropdown = new Select(passenger);
		dropdown.selectByIndex(2);
		
	 WebElement child=	driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Child']"));
		
	 dropdown = new Select(child);
		dropdown.selectByIndex(3);
		
	WebElement infant=	driver.findElement(By.xpath("//select[@class='wMed1s required' and @id='ctl00_mainContent_ddl_Infant']"));
		
	dropdown = new Select(infant);
	dropdown.selectByIndex(3);
	}

	@When("Click on Search Button")
	public void click_on_Search_Button() {
		
		 driver.findElement(By.xpath("//input[@name='ctl00$mainContent$btn_FindFlights']")).click();
}

}
