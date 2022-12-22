package starter.loginPage;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
@DefaultUrl("")

public class ramologinPage extends PageObject {

    public void setuserTxtBox(String username){
        $(By.cssSelector("input[placeholder='Enter your username']")).sendKeys(username);
    }
    public void setpassTxtBox(String password){
        $(By.cssSelector("input[placeholder='Enter your password']")).sendKeys(password);
    }
    public void ClickLoginBtn(){
        $(By.cssSelector("div[class='text-sm']")).click();
    }

}
