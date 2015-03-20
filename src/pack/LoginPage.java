package pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Sl on 13.03.2015.
 */
public class LoginPage {
    private WebDriver Chrome;
    @FindBy(id = "login_field")
    private WebElement login;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(name = "commit")
    private WebElement commit;

    public LoginPage(WebDriver Chrome){
        PageFactory.initElements(Chrome, this);
        this.Chrome = Chrome;
    }

    public void login(String username, String passwd) {
        login.sendKeys(username);
        password.sendKeys(passwd);
    }
    public void click_me(){
        commit.click();
    }

}
