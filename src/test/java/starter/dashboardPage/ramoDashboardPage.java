package starter.dashboardPage;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ramoDashboardPage extends PageObject {

    public void dashboardVerified(){

        $(By.xpath("//*[text() = 'Dashboard']"));
    }
    public void masterData(){
        $(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/img[1]")).click();
    }
    public void taxes(){
        $(By.xpath("//div[contains(text(),'Taxes')]")).click();
    }
}
