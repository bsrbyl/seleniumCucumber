package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class GuruPage {

   public GuruPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//span[@class='mat-button-wrapper'])[4]")
    public WebElement acceptCookies;

   @FindBy(xpath = "//thead//th")
    public List<WebElement> baslikListesi;

}
