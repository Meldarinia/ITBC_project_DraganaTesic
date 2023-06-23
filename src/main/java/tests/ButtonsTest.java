package tests;

import org.testng.annotations.Test;

public class ButtonsTest extends BaseTest {

    @Test
    public void checkDoubleClickMeButton() {
        getButtonsPage().open();
        doubleClick(getButtonsPage().getDoubleClickMeButton());
        assertVisibilityOfElement(getButtonsPage().getDoubleClickMessage());
    }

    @Test
    public void checkRightClickMeButton() {
        getButtonsPage().open();
        rightClick(getButtonsPage().getRightClickMeButton());
        assertVisibilityOfElement(getButtonsPage().getRightClickMessage());
    }

    @Test
    public void checkClickMeButton(){
        getButtonsPage().open();
        clickElement(getButtonsPage().getDynamicClickMeButton());
        assertVisibilityOfElement(getButtonsPage().getDynamicClickMessage());
    }
}
