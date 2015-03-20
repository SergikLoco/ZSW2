package pack;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.sql.Driver;
import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class TestWebDr {
    public static void main(String[]args){

        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        WebDriver Chrome = new ChromeDriver();

        Chrome.get("http://github.com");
        Factory Fack = new Factory(Chrome);
        Fack.MaxScreen();
        Fack.Sign_page();
        LoginPage loginPage = new LoginPage(Chrome);
        loginPage.login("SergikLoco", "sl23215SL23215");
        loginPage.click_me();
        CreateNewRepository Repo = new CreateNewRepository(Chrome);
        Repo.clik_me();
        ConfirmCreate Confirm = new ConfirmCreate(Chrome);
        Confirm.confirm("qweewq1");
        Chrome.quit();
    }

}
