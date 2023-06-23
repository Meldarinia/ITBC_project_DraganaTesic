package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ButtonsPage extends BasePage {
    private WebElement doubleClickMeButton;
    private WebElement doubleClickMessage;
    private WebElement rightClickMeButton;
    private WebElement rightClickMessage;
    private WebElement dynamicClickMeButton;
    private WebElement dynamicClickMessage;

    public ButtonsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getDoubleClickMeButton() {
        doubleClickMeButton = getDriver().findElement(By.id("doubleClickBtn"));
        return doubleClickMeButton;
    }

    public WebElement getDoubleClickMessage() {
        doubleClickMessage = getDriver().findElement(By.id("doubleClickMessage"));
        return doubleClickMessage;
    }

    public WebElement getRightClickMeButton() {
        rightClickMeButton = getDriver().findElement(By.id("rightClickBtn"));
        return rightClickMeButton;
    }

    public WebElement getRightClickMessage() {
        rightClickMessage = getDriver().findElement(By.id("rightClickMessage"));
        return rightClickMessage;
    }
    public WebElement getDynamicClickMeButton(){
        dynamicClickMeButton = getDriver().findElement(By.xpath("//button[text()='Click Me']"));
        return dynamicClickMeButton;
    }
    public WebElement getDynamicClickMessage(){
        dynamicClickMessage = getDriver().findElement(By.id("dynamicClickMessage"));
        return dynamicClickMessage;
    }

    public ButtonsPage open() {
        getDriver().get("https://demoqa.com/buttons");
        return this;
    }
}
