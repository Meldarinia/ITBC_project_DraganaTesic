package tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.*;

import java.time.Duration;


public class BaseTest {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions actions;
    private JavascriptExecutor javascriptExecutor;
    private IndexPage indexPage;
    private TextBoxPage textBoxPage;
    private RadioButtonPage radioButtonPage;
    private ButtonsPage buttonsPage;
    private LoginBookStorePage loginBookStorePage;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gaga\\Desktop\\chrome driver\\chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        actions = new Actions(driver);
        javascriptExecutor = (JavascriptExecutor) driver;
        indexPage = new IndexPage(driver, wait);
        textBoxPage = new TextBoxPage(driver, wait);
        radioButtonPage = new RadioButtonPage(driver, wait);
        buttonsPage = new ButtonsPage(driver, wait);
        loginBookStorePage = new LoginBookStorePage(driver, wait);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @BeforeMethod
    public void beforeEachTest() throws InterruptedException {
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getWait() {
        return wait;
    }

    public Actions getActions() {
        return actions;
    }

    public JavascriptExecutor getJavascriptExecutor() {
        return javascriptExecutor;
    }

    public IndexPage getIndexPage() {
        return indexPage;
    }

    public TextBoxPage getTextBoxPage() {
        return textBoxPage;
    }

    public RadioButtonPage getRadioButtonPage() {
        return radioButtonPage;
    }

    public ButtonsPage getButtonsPage() {
        return buttonsPage;
    }

    public LoginBookStorePage getLoginBookStorePage() {
        return loginBookStorePage;
    }

    public void moveToElement(WebElement element) {
        actions.moveToElement(element).pause(2).perform();
    }

    public void clickElement(WebElement element) {
        actions.click(element).perform();
    }

    public void doubleClick(WebElement element) {
        actions.doubleClick(element).perform();
    }

    public void rightClick(WebElement element) {
        actions.contextClick(element).perform();
    }

    public void scrollDown(int numberOfPixels) {
        javascriptExecutor.executeScript("window.scrollBy(0," + numberOfPixels + ")", "");
    }

    public void assertVisibilityOfElement(WebElement element) {
        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOf(element)).isDisplayed());
    }

    public void waitPageLoads(String endpoint) {
        wait.until(ExpectedConditions.urlContains(endpoint));
    }


    @AfterClass
    public void cleanUp() {
        getDriver().close();
    }
}
