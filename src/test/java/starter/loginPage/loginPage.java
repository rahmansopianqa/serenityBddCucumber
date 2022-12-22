package starter.loginPage;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;

public class loginPage {

    ramologinPage loginPage;

    @Step
    public void openAplication(){
        loginPage.open("https://apg-stagingramo.barransdemo.com/login");
    }
    @Step
    public void username(String username){
        loginPage.setuserTxtBox(username);
    }
    @Step
    public void password(String password){
        loginPage.setpassTxtBox(password);
    }
    @Step
    public void clickBtnLogin(){
        loginPage.ClickLoginBtn();
    }
}
