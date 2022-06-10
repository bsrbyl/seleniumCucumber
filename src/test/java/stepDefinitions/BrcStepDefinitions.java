package stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class BrcStepDefinitions {

    BrcPage brcpage= new BrcPage();

    @Then("Kullanici Login butonuna basar")
    public void kullanici_login_butonuna_basar() {
        brcpage.loginButonu.click();

    }
    @Then("firstName bolumune {string} yazar")
    public void first_name_bolumune_yazar(String firstName) {
    brcpage.firstName.sendKeys(firstName);
    }
    @Then("lastName bolumune {string} yazar")
    public void last_name_bolumune_yazar(String lastName) {
      brcpage.lastName.sendKeys(lastName);
    }

    @Then("zipCode bolumune {string} yazar")
    public void zip_code_bolumune_yazar(String zipCode) {
    brcpage.zipCode.sendKeys(zipCode);
    }


    @Then("passwordConfirm bolumune {string} yazar")
    public void password_confirm_bolumune_yazar(String passwordConfirm) {
     brcpage.confirmPassword.sendKeys(passwordConfirm);
    }
    @Then("register butonuna basar")
    public void register_butonuna_basar() {

        brcpage.registerButton.click();
    }


    @And("kullnici Create new user butonuna basar")
    public void kullniciCreateNewUserButonunaBasar() {

        brcpage.creatNewUser.click();
    }

    @And("adress bolumune {string} yazar")
    public void adressBolumuneYazar(String address) {
        brcpage.address.sendKeys(address);
    }

    @And("phoneNumber bolumune  yazar")
    public void phonenumberBolumuneYazar() {
       // brcpage.phoneNumber.sendKeys(ConfigReader.getProperty(phoneNumber) );
        Actions actions = new Actions(Driver.getDriver());
       actions.sendKeys(Keys.TAB).sendKeys("1234567890").perform();
    }

    @And("email bolumune {string} yazar")
    public void emailBolumuneYazar(String email) {
        brcpage.email.sendKeys(ConfigReader.getProperty(email));
    }

    @And("password bolumune {string} yazar")
    public void passwordBolumuneYazar(String password) {
        brcpage.password.sendKeys(ConfigReader.getProperty(password));
    }


    @And("kullanici analogin butonuna basar")
    public void kullaniciAnaloginButonunaBasar() {
        brcpage.loginButonu2.click();
    }
}
