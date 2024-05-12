import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {
    WebDriver driver;

    @Given("User sudah berada di halaman login page pada browser")
    public void user_is_on_the_login_page() {
        System.setProperty("webdriver.chrome.driver", "chromedriver-win64");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
    }

    @When("User memasukkan valid username & password")
    public void user_enters_valid_username_and_password() {
        WebElement usernameField = driver.findElement(By.id("user-name"));
        WebElement passwordField = driver.findElement(By.id("password"));

        usernameField.sendKeys("standard_user");
        passwordField.sendKeys("secret_sauce");
    }

    @When("User mengklik button Login")
    public void user_clicks_on_the_login_button() {
        WebElement loginButton = driver.findElement(By.id("submit-button"));
        loginButton.click();
    }

    @Then("User dinavigasikan ke halaman Dashboard")
    public void user_should_be_redirected_to_the_dashboard_page() {
        // Add assertion to verify if redirected to the dashboard page
        driver.quit();
    }

    @When("User memasukkan valid username & invalid password")
    public void user_enters_invalid_username_and_or_password() {
        WebElement usernameField = driver.findElement(By.id("user-name"));
        WebElement passwordField = driver.findElement(By.id("password"));

        usernameField.sendKeys("invalid_username");
        passwordField.sendKeys("invalid_password");
    }

    @Then("User mendapat pesan gagal login")
    public void user_should_see_an_error_message() {
        // Add assertion to verify if error message is displayed
        driver.quit();
    }
}
