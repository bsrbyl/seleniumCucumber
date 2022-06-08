package stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.BrcPage;

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
    @Then("phoneNumber bolumune {string} yazar")
    public void phone_number_bolumune_yazar(String phoneNumber) {
    brcpage.phoneNumber.sendKeys(phoneNumber);
    }
    @Then("zipCode bolumune {string} yazar")
    public void zip_code_bolumune_yazar(String zipCode) {
    brcpage.zipCode.sendKeys(zipCode);
    }
    @Then("email bolumune {string} yazar")
    public void email_bolumune_yazar(String email) {
     brcpage.email.sendKeys(email);
    }
    @Then("password bolumune {string} yazar")
    public void password_bolumune_yazar(String password) {
    brcpage.password.sendKeys(password);
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
}
