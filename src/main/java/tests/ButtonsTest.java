package tests;

import org.testng.annotations.Test;

public class ButtonsTest extends BaseTest {

    @Test
    public void checkDoubleClickMeButton() {
        getButtonsPage().open();
        scrollDown(400);
        doubleClick(getButtonsPage().getDoubleClickMeButton());
        assertVisibilityOfElement(getButtonsPage().getDoubleClickMessage());
    }

    @Test
    public void checkRightClickMeButton() {
        getButtonsPage().open();
        scrollDown(600);
        rightClick(getButtonsPage().getRightClickMeButton());
        assertVisibilityOfElement(getButtonsPage().getRightClickMessage());
    }

    @Test
    public void checkClickMeButton(){
        getButtonsPage().open();
        scrollDown(600);
        clickElement(getButtonsPage().getDynamicClickMeButton());
        assertVisibilityOfElement(getButtonsPage().getDynamicClickMessage());
    }
}
