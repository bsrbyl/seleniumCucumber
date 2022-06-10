package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BrcPage {
    public BrcPage(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath= "//a[@class='btn btn-primary btn-sm']")
    public WebElement loginButonu;

    @FindBy(xpath = "//*[text()='Create new user']")
    public WebElement creatNewUser;

    @FindBy(name = "firstName")
    public  WebElement firstName;

  @FindBy(name = "lastName")
    public  WebElement lastName;

  @FindBy(xpath = "//input[@name='phoneNumber']")
    public WebElement phoneNumber;


  @FindBy(xpath = "//input[@name='address']")
    public WebElement address;

    @FindBy(xpath = "//input[@name='zipCode']")
    public WebElement zipCode;


    @FindBy(xpath = "//input[@name='email']")
    public WebElement email;


    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//input[@name='confirmPassword']")
    public  WebElement confirmPassword;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement registerButton;

    @FindBy(xpath = "(//button[@class='btn btn-primary'])[3]")
    public WebElement asagiclick;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButonu2;

}
