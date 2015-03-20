package pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Sl on 13.03.2015.
 */
public class CreateNewRepository {
    private WebDriver Chrome;

    @FindBy(linkText = "New repository")
    WebElement repo;

    public CreateNewRepository(WebDriver Chrome){
        PageFactory.initElements(Chrome, this);
        this.Chrome = Chrome;
    }
    public void clik_me(){
        repo.click();
    }
}
