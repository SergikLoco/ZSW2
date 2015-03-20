package pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Sl on 13.03.2015.
 */
public class Factory {
    private WebDriver Chrome;

    @FindBy(linkText = "Sign in")
    private WebElement sign_up_on_login;
    public Factory(WebDriver Chrome){
        PageFactory.initElements(Chrome, this );
        this.Chrome = Chrome;
}

public void Sign_page(){
    sign_up_on_login.click();
}
public void MaxScreen(){
    Chrome.manage().window().maximize();
}


}
