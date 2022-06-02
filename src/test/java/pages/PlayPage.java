package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PlayPage extends BasePage{
    @FindBy (xpath = "//*[contains(text(), 'the requested URL was not found on this server.')]")
    public WebElement alertText;
}
