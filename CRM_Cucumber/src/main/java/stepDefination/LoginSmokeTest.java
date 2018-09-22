package stepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSmokeTest {
	WebDriver dir;

	@Given("^User is already on Login page$")
	public void user_is_already_on_Login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"A://software//selenium//chromedriver_win32//chromedriver.exe");
		dir = new ChromeDriver();
		System.out.println("Hieee");
		dir.get("https://www.freecrm.com/index.html");

	}

	@When("^Title of login page is Free CRM$")
	public void Title_of_login_page_is_Free_CRM() {
		String title = dir.getTitle();
		System.out.println("Title is :" + title);
		Assert.assertEquals(
				"#1 Free CRM software in the cloud for sales and service",
				title);
	}

	@Then("^User enter username and password$")
	public void User_enter_username_and_password() {
		dir.findElement(By.name("username")).sendKeys("nikita17");
		dir.findElement(By.name("password")).sendKeys("nikita17");
	}

	@And("^User click on login button$")
	public void User_click_on_login_button() {
		WebElement button = dir
				.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js = (JavascriptExecutor) dir;
		js.executeScript("arguments[0].click()", button);

	}

	@Then("^User is in Homepage$")
	public void User_is_on_Home_page() {
		String Home_Title = dir.getTitle();
		Assert.assertEquals("CRMPRO", Home_Title);
		dir.close();
	}

}