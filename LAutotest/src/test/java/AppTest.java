import com.browser.FactoryBrowser;
import org.example.LoginPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class AppTest {

    WebDriver driver = FactoryBrowser.SetupBrowser("edge", "https://www.instagram.com/");

    @Test
    public void LoginVerification() throws InterruptedException {
        LoginPage login = PageFactory.initElements(driver, LoginPage.class);
        //UI-1
        login.loginWebsite("raviteja0514", "Automate12");

    }
}
