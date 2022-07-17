package steps;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MyStepdefs {

    private WebDriver driver;

    @Before
    public void Setup(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
    }

    //1 @Given("I am in the login pagee")
    @Given("I am in the login page")
    public void iAmInTheLoginPage() {
        driver.get("https://the-internet.herokuapp.com/login");
    }

    //1
    /*@When("I enter valid credentials")
    public void iEnterValidCredentials() {
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.cssSelector("#login button")).click();
    }*/
    //2
    @When("I enter valid username as {string} and password as {string}")
    public void iEnterValidUsernameAndPassword(String arg0, String arg1) {
        driver.findElement(By.id("username")).sendKeys(arg0);
        driver.findElement(By.id("password")).sendKeys(arg1);
        driver.findElement(By.cssSelector("#login button")).click();
    }

    @Then("I should be taken to the Overview page")
    public void iShouldBeTakenToTheOverviewPage() {
        driver.findElement(By.xpath("//a[@class=\"button secondary radius\"]")).isDisplayed();
    }

    @After
    public void QuitBrowser(){
        driver.quit();
    }
}
