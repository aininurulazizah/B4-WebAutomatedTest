import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Web elements locators
    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");
    private By menuButton = By.id("react-burger-menu-btn");
    private By logoutLink = By.id("logout_sidebar_link");

    // Methods to interact with the elements
    public void enterUsername(String username) {
        WebElement usernameElement = driver.findElement(usernameField);
        usernameElement.sendKeys(username);
    }

    public void enterPassword(String password) {
        WebElement passwordElement = driver.findElement(passwordField);
        passwordElement.sendKeys(password);
    }

    public void clickLoginButton() {
        WebElement loginButtonElement = driver.findElement(loginButton);
        loginButtonElement.click();
    }

    public void clickMenuButton() {
        WebElement menuButtonElement = driver.findElement(menuButton);
        menuButtonElement.click();
    }

    public void clickLogoutLink() {
        WebElement logoutLinkElement = driver.findElement(logoutLink);
        logoutLinkElement.click();
    }

    public String isOnDashboardPage() {
        return driver.getCurrentUrl();
    }

    public String isOnLoginPage() { return driver.getCurrentUrl(); }

    public String errorMessageUsernamePasswordInvalid() {
        WebElement errorMessageElement = driver.findElement(By.cssSelector(".error-message-container h3[data-test='error']"));
        String actualErrorMessage = errorMessageElement.getText();
        return actualErrorMessage;
    }
}
