package pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Sl on 13.03.2015.
 */
public class ConfirmCreate {
    private WebDriver Chrome;

    @FindBy(id = "repository_name")
    WebElement repo_name;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement x_pass;

    public ConfirmCreate(WebDriver Chrome){
        PageFactory.initElements(Chrome, this);
        this.Chrome = Chrome;
    }
    public boolean confirm(String name){
        repo_name.sendKeys(name);
        x_pass.submit();
        return true;
    }

}
