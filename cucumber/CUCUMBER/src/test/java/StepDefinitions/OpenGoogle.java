package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OpenGoogle {

	WebDriver driver; // class level

	@When("user open chrome browser")
	public void user_open_chrome_browser() {
		driver = new ChromeDriver(); // assign to class variable
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}

	@When("user enters link {string}")
	public void user_enters_link(String url) {
		driver.navigate().to(url); // use feature file value
	}

	@Then("user sees google home page")
	public void user_sees_google_home_page() {
		String title = driver.getTitle();
		System.out.println("Page title is: " + title);
	}
}
